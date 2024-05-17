package com.kartheek.customvalidations.roletypes;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class RoleTypeValidator implements ConstraintValidator<ValidateRoleType, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        List<String> roleTypes = Arrays.asList("ROLE_ADMIN, ROLE_USER");
        return roleTypes.contains(s);
    }
}
