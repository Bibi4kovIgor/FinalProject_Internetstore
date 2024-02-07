package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Products;
import edu.lemon.internetstore.web.dto.ProductsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductsMapper {
  ProductsDto toDto(Products product);
}
