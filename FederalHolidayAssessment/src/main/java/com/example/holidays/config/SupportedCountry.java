package com.example.holidays.config;

public enum SupportedCountry {
    US, CA; // To extend, simply add new ISO codes here (e.g., GB, FR, MX)

    public static boolean isValid(String code) {
        try {
            SupportedCountry.valueOf(code.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
