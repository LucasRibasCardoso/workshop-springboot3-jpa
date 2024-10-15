package com.LucasRibasCardoso.course.resources;

import com.LucasRibasCardoso.course.entities.User;
import com.LucasRibasCardoso.course.repositories.UserRepository;
import com.LucasRibasCardoso.course.services.UserService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService userService;
  @Autowired
  private UserRepository userRepository;

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

  @PostMapping(value = "")
  public ResponseEntity<User> insert(@RequestBody User user) {
    user = userService.save(user);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(user.getId())
        .toUri();
    return ResponseEntity.created(uri).body(user);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<User> delete(@PathVariable Long id) {
    userService.delete(id);
    return ResponseEntity.noContent().build();
  }

  @PutMapping(value = "{id}")
  public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
    user = userService.update(id, user);
    return ResponseEntity.ok().body(user);
  }
}
