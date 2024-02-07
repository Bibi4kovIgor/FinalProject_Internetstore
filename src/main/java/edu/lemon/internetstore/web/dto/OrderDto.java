package edu.lemon.internetstore.web.dto;

import lombok.Builder;

import java.time.Instant;

@Builder
public record OrderDto(ClientDto clientDto,
                       ProductDto productDto,
                       int quantity,
                       Instant orderDate) {}
