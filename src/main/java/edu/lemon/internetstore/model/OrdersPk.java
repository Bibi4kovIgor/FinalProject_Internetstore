package edu.lemon.internetstore.model;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersPk implements Serializable {
  private Clients client;
  private Products product;
  private Instant orderDate;
}
