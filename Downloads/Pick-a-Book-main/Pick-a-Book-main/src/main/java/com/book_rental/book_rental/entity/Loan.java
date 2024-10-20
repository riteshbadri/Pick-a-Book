package com.book_rental.book_rental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Transactions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    @ManyToOne // Assuming a loan has one lender
    @JoinColumn(name = "lender_id") // Create a foreign key column in the Transactions table
    private User lender;

    @ManyToOne // Assuming a loan has one borrower
    @JoinColumn(name = "borrower_id") // Create a foreign key column in the Transactions table
    private User borrower;

    @Column
    private LocalDateTime lentDate;

    @Column
    private LocalDateTime returnDate;

    @ManyToOne // Assuming a loan is for one book
    @JoinColumn(name = "book_id") // Create a foreign key column in the Transactions table
    private Books book;
}
