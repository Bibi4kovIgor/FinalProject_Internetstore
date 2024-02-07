package edu.lemon.internetstore.service;

import edu.lemon.internetstore.dao.DocumentsRepository;
import edu.lemon.internetstore.mapper.DocumentsMapper;
import edu.lemon.internetstore.web.dto.DocumentsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentsService {
  private final DocumentsMapper documentsMapper;
  private final DocumentsRepository documentsRepository;

  public DocumentsService(DocumentsMapper documentsMapper, DocumentsRepository documentsRepository) {
    this.documentsMapper = documentsMapper;
    this.documentsRepository = documentsRepository;
  }

  public List<DocumentsDto> getAllDocuments(){
    return documentsRepository.findAll()
        .stream()
        .map(documentsMapper::toDto)
        .toList();
  }
}
