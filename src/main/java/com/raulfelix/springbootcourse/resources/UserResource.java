package com.raulfelix.springbootcourse.resources;

import com.raulfelix.springbootcourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Maria", "mariga@gmail.com", "99999999", "123456");
        return ResponseEntity.ok().body(user);
    }
}
