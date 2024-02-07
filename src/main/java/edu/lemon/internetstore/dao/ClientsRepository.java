package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Client;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClientsRepository extends JpaRepository<Client, UUID> {
  Client findByDocumentId(UUID documentId);
}
