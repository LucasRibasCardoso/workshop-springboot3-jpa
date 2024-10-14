package com.LucasRibasCardoso.course.repositories;

import com.LucasRibasCardoso.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
