package xyz.chaobei.common.validation;

import xyz.chaobei.common.validation.enums.PassLevel;
import xyz.chaobei.common.validation.interfaces.PasswordValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * 验证密码,最少六位，最多16位数
 *
 * 普通密码：以字母开头，长度在6~16之间，只能包含字母、数字和下划线
 * 强密码：必须包含大小写字母和数字的组合，可以使用特殊字符，长度在6-16之间
 *
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2021/3/11
 */
public class PasswordValidation implements ConstraintValidator<PasswordValue, String> {

    private final String normal = "^[a-zA-Z]\\w{5,15}$";

    private final String strong = "^^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,16}$";

    private final String feeble = "^[a-zA-Z0-9]\\w{5,15}$";

    private PasswordValue passwordValue;

    @Override
    public void initialize(PasswordValue constraintAnnotation) {
        this.passwordValue = constraintAnnotation;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.isNull(value)) {
            return false;
        }
        if (passwordValue.level().equals(PassLevel.NORMAL)) {
            return value.matches(normal);
        }
        if (passwordValue.level().equals(PassLevel.STRONG)) {
            return value.matches(strong);
        }
        return value.matches(feeble);
    }
}
