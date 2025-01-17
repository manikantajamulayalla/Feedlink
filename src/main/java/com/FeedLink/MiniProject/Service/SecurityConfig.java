package com.FeedLink.MiniProject.Service;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig  {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Disable CSRF for simplicity
                .authorizeHttpRequests()
                .requestMatchers(
                        "/",               // Home page
                        "/css/**",         // Static CSS files
                        "/images/**",      // Static images
                        "/js/**",          // Static JS files
                        "/donor",          // Add Donation page
                        "/viewdonation",   // Donations list
                        "/recipient",      // Add Recipient page
                        "/viewrecipients", // Recipients list
                        "/feedback",       // Feedback page
                        "/contact",        // Contact Us page
                        "/about",          // About Us page
                        "/registration",   // Registration page
                        "/login"           // Login page
                ).permitAll() // Allow access to all endpoints without authentication
                .anyRequest().permitAll() // Allow all other requests (ensure full accessibility)
                .and()
                .formLogin().disable() // Disable the login form
                .logout().disable();   // Disable logout functionality (optional, if not needed)

        return http.build();
    }
}
