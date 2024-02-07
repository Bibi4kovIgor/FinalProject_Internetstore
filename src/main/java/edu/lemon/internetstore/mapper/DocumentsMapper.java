package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Document;
import edu.lemon.internetstore.web.dto.DocumentDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentsMapper {
  DocumentDto toDto(Document document);
  Document fromDto(DocumentDto documentDto);
}
