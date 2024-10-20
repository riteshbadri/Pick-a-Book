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
    @Column
    private User lender;
    @Column
    private User borrower;
    @Column
    private LocalDateTime lentDate;
    @Column
    private LocalDateTime returnDate;
    @Column
    private Books book;

}
