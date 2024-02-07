package edu.lemon.internetstore.web.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record DocumentDto(UUID id, Long taxId, String passport, String additionalInfo) {}
