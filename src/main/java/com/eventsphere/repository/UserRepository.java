package com.eventsphere.repository;

import com.eventsphere.entity.User;
import com.eventsphere.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
<<<<<<< Updated upstream
    Optional<User> findByEmail(String email);
=======

    Optional<User> findByEmail(String email);
    List<User> findByRole(Role role);
>>>>>>> Stashed changes
}
