package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Clients;
import edu.lemon.internetstore.model.Documents;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, UUID> {
  @Nonnull
  List<Clients> findAll();

  Clients findByDocumentId(UUID documentId);
}
