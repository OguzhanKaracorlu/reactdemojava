package com.karacorlu.oguzhan.reactdemojava.repository;

import com.karacorlu.oguzhan.reactdemojava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author oguzhan.karacorlu on 10.04.2023
 * @project reactdemojava
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID>, JpaSpecificationExecutor<User> {
 Boolean existsByUsername(String username);
}
