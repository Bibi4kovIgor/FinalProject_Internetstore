package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Client;
import edu.lemon.internetstore.web.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientsMapper {
  ClientDto toDto(Client client);
  Client fromDto(ClientDto clientDto);


}
