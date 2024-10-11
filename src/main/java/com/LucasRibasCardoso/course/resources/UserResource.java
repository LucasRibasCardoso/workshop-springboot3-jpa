package com.LucasRibasCardoso.course.resources;

import com.LucasRibasCardoso.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll(){
    User user = new User(1L, "Lucas", "lucas@gmail.com", "47 992034357", "1384");
    return ResponseEntity.ok().body(user);
  }
}
