package team.a9043.yiluwiki.security.tokenuser;

import java.lang.annotation.*;

/**
 * 获得Token中的 SisUser
 *
 * @author a9043
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TokenUser {
    boolean required() default true;
}
