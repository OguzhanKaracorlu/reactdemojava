package com.karacorlu.oguzhan.reactdemojava.controller;

import com.karacorlu.oguzhan.reactdemojava.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oguzhan.karacorlu on 10.04.2023
 * @project reactdemojava
 */
@RestController
public class UserController {

    public static final Logger log = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/api/users")
    public void createUser(@RequestBody UserDTO userDTO) {
        log.info(userDTO.toString());
    }
}
