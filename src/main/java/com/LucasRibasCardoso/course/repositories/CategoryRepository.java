package com.LucasRibasCardoso.course.repositories;

import com.LucasRibasCardoso.course.entities.Category;
import com.LucasRibasCardoso.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
