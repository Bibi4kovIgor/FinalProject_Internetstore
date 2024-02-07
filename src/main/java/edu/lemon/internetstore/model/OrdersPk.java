package edu.lemon.internetstore.model;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersPk implements Serializable {
  private Client client;
  private Product product;
  private Instant orderDate;
}
