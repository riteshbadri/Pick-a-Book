package com.book_rental.book_rental.entity;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class BorrowedBooks {

    private Long BookId;
    private Long lenderId;
    private Long borrowerId;
    private LocalDateTime lentDate;
    private LocalDateTime returnedDate;
    private boolean returned;

}
