package xyz.chaobei.common.validation.interfaces;


import xyz.chaobei.common.validation.PasswordValidation;
import xyz.chaobei.common.validation.enums.PassLevel;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 密码校验
 *
 * @author MRC
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PasswordValidation.class)
public @interface PasswordValue {

    String message() default "密码必须以字母开头不少于6位";

    PassLevel level() default PassLevel.NORMAL;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
