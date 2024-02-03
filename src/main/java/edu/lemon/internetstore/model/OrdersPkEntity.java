package edu.lemon.internetstore.model;

import jakarta.persistence.IdClass;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class OrdersPkEntity implements Serializable {
  @NonNull private final ClientsEntity clients;
  @NonNull private final ProductsEntity products;
  @NonNull private final Instant orderDate;
}
