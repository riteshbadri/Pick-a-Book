package com.book_rental.book_rental.dto;

import com.book_rental.book_rental.entity.Books;

import java.time.LocalDateTime;
import java.util.List;

public record UserDto(
        Long userId, String username, String password, String email,
        LocalDateTime createdAt, LocalDateTime updatedAt, List<Books> lentBooks,
        List<Books> borrowedBooks, List<Books> willingToSell
    ) {
}
