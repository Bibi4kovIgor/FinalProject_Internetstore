package edu.lemon.internetstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
@IdClass(OrdersPk.class)
public class Order {
  @Id
  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "client_id", referencedColumnName = "id")
  @NonNull
  private Client client;

  @Id
  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "product_id", referencedColumnName = "id")
  @NonNull
  private Product product;

  @Id
  @NonNull
  @Column(name = "order_date")
  private Instant orderDate;

  private int quantity;
}
