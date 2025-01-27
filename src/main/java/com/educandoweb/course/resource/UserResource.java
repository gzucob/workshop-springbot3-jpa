package com.educandoweb.course.resource;

import com.educandoweb.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Gabriel", "zuco@gmail.com", "5499255", "12345" );
        return ResponseEntity.ok().body(user);
    };

}
