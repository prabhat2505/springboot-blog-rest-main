package com.springboot.blog.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordGeneratorEncoder {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println("Encoded password of admin"+passwordEncoder.encode("admin"));
        System.out.println("Encoded password of prabhat"+passwordEncoder.encode("prabhat"));
    }
}
