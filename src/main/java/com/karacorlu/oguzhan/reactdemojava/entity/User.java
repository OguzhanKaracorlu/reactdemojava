package com.karacorlu.oguzhan.reactdemojava.entity;

import com.karacorlu.oguzhan.reactdemojava.dto.UserDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * @author oguzhan.karacorlu on 10.04.2023
 * @project reactdemojava
 */

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;

    private String username;

    private String displayName;

    private String password;

    public User(UserDTO userDTO) {
        setId(userDTO.getId());
        setUsername(userDTO.getUsername());
        setDisplayName(userDTO.getDisplayName());
        setPassword(userDTO.getPassword());
    }

}
