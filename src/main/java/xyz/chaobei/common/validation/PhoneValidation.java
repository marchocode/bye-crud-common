package xyz.chaobei.common.validation;

import xyz.chaobei.common.validation.interfaces.PhoneValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * 匹配国内手机号
 *
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2021/3/9
 */
public class PhoneValidation implements ConstraintValidator<PhoneValue, String> {

    private final String regx = "^(13[0-9]|14[5|7]|15[0|1|2|3|4|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.isNull(value)) {
            return false;
        }
        return Pattern.matches(regx, value);
    }
}
