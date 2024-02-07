package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Document;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DocumentsRepository extends JpaRepository<Document, UUID> {



//  @Nonnull
//  Document findDocumentByClientId(UUID clientId);
}
