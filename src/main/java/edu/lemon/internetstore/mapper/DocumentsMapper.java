package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Documents;
import edu.lemon.internetstore.web.dto.DocumentsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentsMapper {
  DocumentsDto toDto(Documents documents);
}
