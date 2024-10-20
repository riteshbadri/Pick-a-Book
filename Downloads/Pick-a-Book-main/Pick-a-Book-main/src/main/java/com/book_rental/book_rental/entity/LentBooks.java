package com.book_rental.book_rental.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LentBooks {

    private Long bookId;
    private Books book;
    private Long lenderId;
    private Long borrowerId;
    private LocalDateTime lendingDate;
    private LocalDateTime returnDate;
    private boolean returned;

}
