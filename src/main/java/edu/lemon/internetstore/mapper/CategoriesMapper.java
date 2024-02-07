package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Categories;
import edu.lemon.internetstore.web.dto.CategoriesDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriesMapper {
  CategoriesDto toDto(Categories categories);

}
