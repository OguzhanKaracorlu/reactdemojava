package com.karacorlu.oguzhan.reactdemojava.dto;

import com.karacorlu.oguzhan.reactdemojava.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

/**
 * @author oguzhan.karacorlu on 10.04.2023
 * @project reactdemojava
 */
@Getter
@Setter
public class UserDTO {
    private UUID id;
    private Date createdAt;
    private Date updatedAt;
    private String username;
    private String displayName;
    private String password;

    public UserDTO(User user) {
        setId(user.getId());
        setCreatedAt(user.getCreatedAt());
        setUpdatedAt(user.getUpdatedAt());
        setUsername(user.getUsername());
        setDisplayName(user.getDisplayName());
        setPassword(user.getPassword());
    }
}
