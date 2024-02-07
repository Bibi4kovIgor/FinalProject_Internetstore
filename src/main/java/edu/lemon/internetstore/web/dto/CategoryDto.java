package edu.lemon.internetstore.web.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CategoryDto(
        UUID id,
        String name,
        String description
) {}
