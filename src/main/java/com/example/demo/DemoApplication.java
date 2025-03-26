package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return getAuthenticationManager();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private AuthenticationManager getAuthenticationManager() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static class AuthenticationManager {

        public AuthenticationManager() {
        }
    }

    private static class BCryptPasswordEncoder {

        public BCryptPasswordEncoder() {
        }
    }
}
