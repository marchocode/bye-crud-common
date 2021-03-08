package xyz.chaobei.common.validation.interfaces;

import xyz.chaobei.common.validation.EnumValidation;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EnumValidation.class)
public @interface EnumValue {

    ElementType value();

}
