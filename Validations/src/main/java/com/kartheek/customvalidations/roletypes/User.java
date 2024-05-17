package com.kartheek.customvalidations.roletypes;

public class User {

    @ValidateRoleType
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
