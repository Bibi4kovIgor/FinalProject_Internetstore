package edu.lemon.internetstore.web.dto;

import lombok.Builder;

import java.time.Instant;

@Builder
public record OrdersDto(ClientsDto clientDto,
                        ProductsDto productDto,
                        int quantity,
                        Instant orderDate) {}
