package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.security.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthenticationController {

    private static final Logger systemLogger =
            LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private JwtUtil tokenGenerator;

    @GetMapping("/authenticate")
    public TokenResponse authenticate(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader) {
        systemLogger.info(">> Start authenticate()");
        if (!StringUtils.hasText(authorizationHeader) || !authorizationHeader.startsWith("Basic ")) {
            throw new IllegalArgumentException("Missing or invalid Authorization header");
        }

        // Step 1: Decode Basic <credentials>
        String encodedCredentials = authorizationHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String[] credentialParts = new String(decodedBytes, StandardCharsets.UTF_8).split(":", 2);

        if (credentialParts.length != 2 || !"user".equals(credentialParts[0]) || !"pwd".equals(credentialParts[1])) {
            // In production, this would involve real user validation
            throw new IllegalArgumentException("Invalid credentials");
        }

        // Step 2: Generate JWT token
        String jwtToken = tokenGenerator.generateToken(credentialParts[0]);

        systemLogger.info("<< End authenticate()");
        return new TokenResponse(jwtToken);
    }

    // Data transfer object for JSON response structure
    public static class TokenResponse {
        private final String token;
        public TokenResponse(String token) { this.token = token; }
        public String getToken() { return token; }
    }
}
