package com.book_rental.book_rental.repository;

import com.book_rental.book_rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
