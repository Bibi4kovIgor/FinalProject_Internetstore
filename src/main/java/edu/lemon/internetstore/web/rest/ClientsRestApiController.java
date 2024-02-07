package edu.lemon.internetstore.web.rest;

import edu.lemon.internetstore.service.ClientsService;
import edu.lemon.internetstore.web.dto.ClientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientsRestApiController {

  private final ClientsService clientsService;

  public ClientsRestApiController(ClientsService clientsService) {
    this.clientsService = clientsService;
  }

  @GetMapping
  public ResponseEntity<List<ClientDto>> getAllClients(){
    return ResponseEntity.ok(clientsService.getAllClients());
  }

}
