package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Clients;
import edu.lemon.internetstore.web.dto.ClientsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientsMapper {
  ClientsDto toDto(Clients clients);


}
