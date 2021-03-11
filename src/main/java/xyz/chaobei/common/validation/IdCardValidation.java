package xyz.chaobei.common.validation;

import xyz.chaobei.common.validation.interfaces.IdCardValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * 身份证号验证
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2021/3/9
 */
public class IdCardValidation implements ConstraintValidator<IdCardValue, String> {

    private final String regx = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.isNull(value)) {
            return false;
        }
        return Pattern.matches(regx, value);
    }
}
