package com.LucasRibasCardoso.course.services;

import com.LucasRibasCardoso.course.entities.Category;
import com.LucasRibasCardoso.course.repositories.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> findAll() {
    return categoryRepository.findAll();
  }

  public Category findById(Long id) {
    Optional<Category> category = categoryRepository.findById(id);
    return category.orElse(null);
  }
}
