package xyz.chaobei.common.validation;

import xyz.chaobei.common.validation.interfaces.UserNameValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * 验证账号是否满足条件，
 * 帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2021/3/11
 */
public class UserNameValidation implements ConstraintValidator<UserNameValue, String> {

    private final String regx = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.isNull(value)) {
            return false;
        }
        return value.matches(regx);
    }
}
