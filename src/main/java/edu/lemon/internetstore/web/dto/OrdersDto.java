package edu.lemon.internetstore.web.dto;

import lombok.Builder;

import java.time.Instant;

@Builder
public record OrdersDto(ClientsDto customerDto,
                        ProductsDto productDao,
                        int quantity,
                        Instant orderDate) {}
