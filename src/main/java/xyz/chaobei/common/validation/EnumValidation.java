package xyz.chaobei.common.validation;

import xyz.chaobei.common.validation.interfaces.EnumValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 枚举校验
 *
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2021/3/8
 */
public class EnumValidation implements ConstraintValidator<EnumValue, Integer> {

    @Override
    public void initialize(EnumValue constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return false;
    }
}
