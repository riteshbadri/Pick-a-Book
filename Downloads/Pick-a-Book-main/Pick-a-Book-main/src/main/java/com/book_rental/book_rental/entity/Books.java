package com.book_rental.book_rental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column
    private String bookName;

    @Column
    private boolean available;

    @ManyToOne // Assuming a book can have one lender
    @JoinColumn(name = "lender_id") // Create a foreign key column in the Books table
    private User lender;

    @ManyToOne // Assuming a book can have one borrower
    @JoinColumn(name = "borrower_id") // Create a foreign key column in the Books table
    private User borrower;
}
