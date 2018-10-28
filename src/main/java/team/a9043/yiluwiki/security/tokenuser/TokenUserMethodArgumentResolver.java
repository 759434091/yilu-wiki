package team.a9043.yiluwiki.security.tokenuser;

import org.springframework.core.MethodParameter;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import team.a9043.yiluwiki.security.entity.YwAuthenticationToken;

public class TokenUserMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(TokenUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof AnonymousAuthenticationToken) {
            TokenUser tokenUser = parameter.getMethodAnnotation(TokenUser.class);
            if (null != tokenUser && tokenUser.required())
                throw new TokenUserException("No user found but required");
            return null;
        }
        return ((YwAuthenticationToken) SecurityContextHolder.getContext().getAuthentication()).getYwUser();
    }
}
