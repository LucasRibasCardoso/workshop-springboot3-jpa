package com.LucasRibasCardoso.course.services;

import com.LucasRibasCardoso.course.entities.Product;
import com.LucasRibasCardoso.course.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> product = productRepository.findById(id);
    return product.orElse(null);
  }
}
