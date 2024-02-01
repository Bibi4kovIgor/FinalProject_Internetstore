package edu.lemon.internetstore.web.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Builder
public record ProductsDto(
        UUID id,
        String name,
        String vendorCode,
        double quantity,
        boolean availability,
        BigDecimal price,
        String description,
        Set<CategoriesDto> categories
) {}
