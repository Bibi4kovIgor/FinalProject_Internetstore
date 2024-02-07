package edu.lemon.internetstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "documents")
public class Document {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @NonNull private UUID id;

  @Column(name = "tax_id")
  @NonNull private Long taxId;

  @Column(name = "passport")
  @NonNull private String passport;

  @Column(name = "additional_info")
  private String additionalInfo;
}
