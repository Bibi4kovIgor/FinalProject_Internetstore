package edu.lemon.internetstore.web.dto;

import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Builder
public record ProductDto(
        UUID id,
        String name,
        String vendorCode,
        double quantity,
        boolean availability,
        BigDecimal price,
        String description,
        List<CategoryDto> categories
) {
  public static ProductDto getEmptyProductObject(){
    return ProductDto.builder().build();
  }
}
