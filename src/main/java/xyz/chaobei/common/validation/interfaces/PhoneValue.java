package xyz.chaobei.common.validation.interfaces;

import xyz.chaobei.common.validation.PhoneValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 验证手机号
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2021/3/9
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PhoneValidation.class)
public @interface PhoneValue {

    String message() default "手机号格式有误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
