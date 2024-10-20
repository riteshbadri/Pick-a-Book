package com.book_rental.book_rental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
    @Column(name = "username", unique = true, nullable = false)
    public String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "time_created", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "time_updated", nullable = false)
    private LocalDateTime updatedAt;
    @Column(name = "lent_books")
    public List<Books> lentBooks;
    @Column(name = "borrowed_books")
    private List<Books> borrowedBooks;
    @Column(name = "willing_to_sell")
    public List<Books> willingToSell;


}
