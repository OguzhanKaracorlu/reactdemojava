package com.karacorlu.oguzhan.reactdemojava.controller;

import com.karacorlu.oguzhan.reactdemojava.dto.UserDTO;
import com.karacorlu.oguzhan.reactdemojava.service.UserService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author oguzhan.karacorlu on 10.04.2023
 * @project reactdemojava
 */
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    public static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    @PostMapping("/api/users")
    public @ResponseBody
    ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userService.create(userDTO), HttpStatus.CREATED);
    }

    @GetMapping("/api/users")
    public List<UserDTO> getUsers() {
        return userService.getAll();
    }

    @PutMapping("/api/users")
    public @ResponseBody
    ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userService.update(userDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/users/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(userService.delete(id), HttpStatus.OK);
    }
}
