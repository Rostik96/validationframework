package dev.rost.validationframework.validation;

import dev.rost.validationframework.util.Fields;
import lombok.experimental.ExtensionMethod;
import org.apache.commons.lang3.reflect.FieldUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static dev.rost.validationframework.validation.FieldDescriptions.*;
import static org.apache.commons.lang3.BooleanUtils.isTrue;

@ExtensionMethod({Fields.class, FieldUtils.class})
public class TextLengthIsNumberValidator implements ConstraintValidator<TextLengthIsNumber, Object> {

    @Override
    @SuppressWarnings("unchecked")
    public boolean isValid(Object dto, ConstraintValidatorContext context) {
        return dto
                .get(nested).stream()
                .anyMatch(nested -> isTrue(nested.get(flag))
                        && nested.get(text).length() == dto.get(number));
    }


    @Override
    public void initialize(TextLengthIsNumber constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
