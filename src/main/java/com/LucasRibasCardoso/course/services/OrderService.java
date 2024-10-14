package com.LucasRibasCardoso.course.services;

import com.LucasRibasCardoso.course.entities.Order;
import com.LucasRibasCardoso.course.repositories.OrderRepository;
import com.LucasRibasCardoso.course.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;

  public List<Order> findAll() {
    return orderRepository.findAll();
  }

  public Order findById(Long id) {
    Optional<Order> order = orderRepository.findById(id);
    return order.orElse(null);
  }
}
