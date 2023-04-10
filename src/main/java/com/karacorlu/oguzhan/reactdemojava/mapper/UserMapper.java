package com.karacorlu.oguzhan.reactdemojava.mapper;

import com.karacorlu.oguzhan.reactdemojava.dto.UserDTO;
import com.karacorlu.oguzhan.reactdemojava.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author oguzhan.karacorlu on 10.04.2023
 * @project reactdemojava
 */
@Component
public class UserMapper {

    public UserDTO toDTO(User user) {
        return new UserDTO(user);
    }

    public User toEntity(UserDTO userDTO) {
        return new User(userDTO);
    }

    public List<UserDTO> toDTOList(List<User> userList) {
        return userList.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
