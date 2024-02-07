package edu.lemon.internetstore.service;

import edu.lemon.internetstore.dao.ClientsRepository;
import edu.lemon.internetstore.mapper.ClientsMapper;
import edu.lemon.internetstore.web.dto.ClientDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService {
  private final ClientsRepository clientsRepository;
  private final ClientsMapper clientsMapper;

  public ClientsService(ClientsRepository clientsRepository, ClientsMapper clientsMapper) {
    this.clientsRepository = clientsRepository;
    this.clientsMapper = clientsMapper;
  }

  public List<ClientDto> getAllClients(){
    return clientsRepository.findAll()
        .stream()
        .map(clientsMapper::toDto)
        .toList();
  }
}
