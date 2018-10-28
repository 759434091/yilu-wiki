package team.a9043.yiluwiki.security.tokenuser;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import team.a9043.yiluwiki.entity.YwUser;
import team.a9043.yiluwiki.security.entity.YwAuthenticationToken;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author a9043
 */
public class TokenUserAspect {
    @Around(value = "execution(* " +
            "team.a9043.yiluwiki." +
            "controller.*.*(..,@TokenUser (*), ..))",
            argNames = "pjp")
    public Object getUser(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        Annotation[][] methodAnnotations = method.getParameterAnnotations();
        Object[] args = pjp.getArgs();
        Class[] argTypes = method.getParameterTypes();
        int userArgsIdx;
        int annotaionIdx;

        userArgsIdx = IntStream.range(0, args.length)
                .filter(i -> argTypes[i].equals(YwUser.class))
                .filter(i -> Arrays.stream(methodAnnotations[i]).anyMatch(annotation -> annotation.annotationType().equals(TokenUser.class)))
                .findFirst()
                .orElse(-1);

        annotaionIdx = IntStream.range(0, methodAnnotations[userArgsIdx].length)
                .filter(i -> methodAnnotations[userArgsIdx][i].annotationType().equals(TokenUser.class))
                .findAny()
                .orElse(-1);

        if (SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken) {
            if (((TokenUser) methodAnnotations[userArgsIdx][annotaionIdx]).required()) {
                throw new TokenUserException("No user found but required");
            }
            args[userArgsIdx] = null;
        } else {
            args[userArgsIdx] =
                    ((YwAuthenticationToken) SecurityContextHolder.getContext().getAuthentication()).getYwUser();
        }
        return pjp.proceed(args);
    }
}
