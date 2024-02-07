package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Product;
import edu.lemon.internetstore.web.dto.ProductDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductsMapper {
  ProductDto toDto(Product product);

  Product fromDto(ProductDto productDto);
}
