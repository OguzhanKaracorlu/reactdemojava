package com.karacorlu.oguzhan.reactdemojava.service;

import com.karacorlu.oguzhan.reactdemojava.dto.UserDTO;
import com.karacorlu.oguzhan.reactdemojava.entity.User;
import com.karacorlu.oguzhan.reactdemojava.mapper.UserMapper;
import com.karacorlu.oguzhan.reactdemojava.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author oguzhan.karacorlu on 10.04.2023
 * @project reactdemojava
 */
@Service
public class UserService {
    public static final Logger log = LoggerFactory.getLogger(UserService.class);

    private final UserMapper mapper;
    private final UserRepository repository;

    public UserService(UserMapper mapper, UserRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<UserDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    public UserDTO create(UserDTO userDTO) {
        User user = new User(userDTO);
        return mapper.toDTO(repository.save(user));
    }

    public boolean delete(UUID uuid) {
        if (repository.existsById(uuid)) {
            repository.deleteById(uuid);
            return true;
        } else {
            return false;
        }
    }

    public UserDTO update(UserDTO userDTO) {
        User user = repository.findById(userDTO.getId()).get();
        user.setPassword(userDTO.getPassword());
        user.setDisplayName(userDTO.getDisplayName());
        user.setUsername(userDTO.getUsername());
        return mapper.toDTO(repository.save(user));
    }
}
