package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.dao.CategoriesRepository;
import edu.lemon.internetstore.model.ProductsEntity;
import edu.lemon.internetstore.web.dto.ProductsDto;
import org.springframework.stereotype.Component;

@Component
public class ProductsMapper {

    public ProductsDto toDto(ProductsEntity productsEntity) {
        return ProductsDto.builder()
                .id(productsEntity.getId())
                .name(productsEntity.getName())
                .price(productsEntity.getPrice())
                .availability(productsEntity.isAvailability())
                .description(productsEntity.getDescription())
                .quantity(productsEntity.getQuantity())
                .vendorCode(productsEntity.getVendorCode())

                .build();
    }
}
