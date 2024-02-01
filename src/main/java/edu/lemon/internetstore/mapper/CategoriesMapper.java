package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.CategoriesEntity;
import edu.lemon.internetstore.web.dto.CategoriesDto;
import org.springframework.stereotype.Component;

@Component
public class CategoriesMapper {

    public CategoriesDto toDto(CategoriesEntity categoriesEntity) {
        return CategoriesDto.builder()
                .id(categoriesEntity.getId())
                .name(categoriesEntity.getName())
                .description(categoriesEntity.getDescription())
                .build();
    }

}
