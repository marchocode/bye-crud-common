package xyz.chaobei.common.validation.interfaces;

import xyz.chaobei.common.validation.UserNameValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 验证账号是否合法注解
 *
 * @author MRC
 */
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy = UserNameValidation.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserNameValue {

    String message() default "用户名以字母开头组合数字，不少于5位";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
