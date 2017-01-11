package com.greenfox.exams.spring.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anna on 17/01/11.
 */

public class CheckExperienceValidator implements ConstraintValidator<CheckExperience, String> {

    @Override
    public void initialize(CheckExperience constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        ArrayList<String> validTexts = new ArrayList<>(Arrays.asList("amazing", "awesome", "blithesome", "excellent", "fabulous", "fantastic", "favorable", "fortuitous", "great", "incredible", "ineffable", "mirthful", "outstanding", "perfect", "propitious", "remarkable", "smart", "spectacular", "splendid", "stellar", "stupendous", "super", "ultimate", "unbelievable", "wondrous"));
        int count = 0;
        String experience = value.toLowerCase();
        for (String temp : validTexts) {
            if(experience.contains(temp)) {
                count++;
            }
        }
        return count >= 3 && !value.isEmpty();
    }
}
