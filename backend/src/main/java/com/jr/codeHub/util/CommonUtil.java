package com.jr.codeHub.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CommonUtil {
    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String encodePassword(String rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }

    public static boolean matches(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
