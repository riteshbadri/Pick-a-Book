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
    @Column
    private User Lenders;
    @Column
    private User Borrowers;


}
