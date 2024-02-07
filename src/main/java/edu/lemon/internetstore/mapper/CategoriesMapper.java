package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Category;
import edu.lemon.internetstore.web.dto.CategoryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriesMapper {
  CategoryDto toDto(Category category);
  Category fromDto(CategoryDto categorydto);

}
