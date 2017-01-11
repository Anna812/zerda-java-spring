package com.greenfox.exams.spring.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Anna on 17/01/11.
 */
public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    @Override
    public void initialize(CheckEmail constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String email = value.toLowerCase();
        return email.contains("@") && email.contains(".") && !email.isEmpty();
    }
}
