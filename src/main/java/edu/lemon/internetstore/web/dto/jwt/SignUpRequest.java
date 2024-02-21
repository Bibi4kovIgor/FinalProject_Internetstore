package edu.lemon.internetstore.web.dto.jwt;

import lombok.Builder;

@Builder
public record SignUpRequest(
    String username,
    String email,
    String password){}