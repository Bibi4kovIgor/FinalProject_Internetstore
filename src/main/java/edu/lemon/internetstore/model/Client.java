package edu.lemon.internetstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id")
  private UUID id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "phone")
  private String phone;

  @Column(name = "login")
  private String login;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "birth_date")
  private Instant birthDate;

  @OneToOne(fetch = FetchType.EAGER,
      cascade = CascadeType.ALL,
      orphanRemoval = true)
  @JoinColumn(name = "document_id",
      referencedColumnName = "id")
  @NonNull private Document document;

}
