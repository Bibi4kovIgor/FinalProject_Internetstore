package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.User;
import edu.lemon.internetstore.web.dto.UserDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {
  UserDto toDto(User user) ;
  User fromDto(UserDto userDto);
}
