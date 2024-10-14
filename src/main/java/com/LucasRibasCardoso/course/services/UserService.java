package com.LucasRibasCardoso.course.services;

import com.LucasRibasCardoso.course.entities.User;
import com.LucasRibasCardoso.course.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User findById(Long id) {
    Optional<User> user = userRepository.findById(id);
    return user.orElse(null); // retorna o usuário, ou caso nao for encontrado, retorna null
  }
}
