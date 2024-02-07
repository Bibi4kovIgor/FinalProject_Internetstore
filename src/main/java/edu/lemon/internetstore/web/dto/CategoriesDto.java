package edu.lemon.internetstore.web.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CategoriesDto(
        UUID id,
        String name,
        String description
) {}
