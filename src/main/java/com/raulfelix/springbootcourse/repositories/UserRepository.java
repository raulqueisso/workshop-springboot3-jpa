package com.raulfelix.springbootcourse.repositories;

import com.raulfelix.springbootcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
