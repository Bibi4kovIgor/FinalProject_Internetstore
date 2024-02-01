package edu.lemon.internetstore.web.dto;

import edu.lemon.internetstore.model.ProductsEntity;
import lombok.Builder;

import java.util.Set;
import java.util.UUID;

@Builder
public record CategoriesDto(
        UUID id,
        String name,
        String description,
        Set<ProductsEntity> products
) {}
