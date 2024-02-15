package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.User;
import edu.lemon.internetstore.web.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
  public UserDto toDto(User user) {
    return UserDto.builder()
        .role(user.getRole())
        .name(user.getName())
        .pass(user.getPass())
        .build();
  }
}
