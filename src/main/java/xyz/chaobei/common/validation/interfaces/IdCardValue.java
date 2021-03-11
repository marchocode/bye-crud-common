package xyz.chaobei.common.validation.interfaces;

import xyz.chaobei.common.validation.IdCardValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 身份证号校验注解
 *
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2021/3/9
 */
@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdCardValidation.class)
public @interface IdCardValue {

    String message() default "身份证号格式有误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
