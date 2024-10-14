package com.LucasRibasCardoso.course.resources;

import com.LucasRibasCardoso.course.entities.User;
import com.LucasRibasCardoso.course.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<List<User>> findAll(){
    List<User> userList = userService.findAll();

    return ResponseEntity.ok().body(userList);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id){
    User user = userService.findById(id);
    return ResponseEntity.ok().body(user);
  }
}
