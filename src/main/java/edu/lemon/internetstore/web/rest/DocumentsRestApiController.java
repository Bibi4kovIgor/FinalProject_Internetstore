package edu.lemon.internetstore.web.rest;

import edu.lemon.internetstore.service.DocumentsService;
import edu.lemon.internetstore.web.dto.DocumentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentsRestApiController {

  private final DocumentsService documentsService;

  public DocumentsRestApiController(DocumentsService documentsService) {
    this.documentsService = documentsService;
  }

  @GetMapping
  public ResponseEntity<List<DocumentDto>> getAllDocuments(){
    return ResponseEntity.ok(documentsService.getAllDocuments());
  }

}
