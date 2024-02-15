package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, String> {
  User findByName(String name);
}
