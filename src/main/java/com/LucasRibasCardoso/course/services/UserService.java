package com.LucasRibasCardoso.course.services;

import com.LucasRibasCardoso.course.entities.User;
import com.LucasRibasCardoso.course.repositories.UserRepository;
import com.LucasRibasCardoso.course.services.exceptions.DatabaseException;
import com.LucasRibasCardoso.course.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
    return user.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public User save(User user) {
    return userRepository.save(user);
  }

  public void delete(Long id) {
    if (!userRepository.existsById(id)) {
      throw new ResourceNotFoundException(id);
    }

    try {
      userRepository.deleteById(id);
    }
    catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException(id);
    }
    catch (DataIntegrityViolationException e) {
      throw new DatabaseException(e.getMessage());
    }
  }

  public User update(Long id, User user) {
    try {
      User entity = userRepository.getReferenceById(id);
      updateData(entity, user);
      return userRepository.save(entity);
    }
    catch (EntityNotFoundException e) {
      throw new ResourceNotFoundException(id);
    }
  }

  private void updateData(User entity, User user) {
    entity.setName(user.getName());
    entity.setEmail(user.getEmail());
    entity.setPhone(user.getPhone());
  }
}
