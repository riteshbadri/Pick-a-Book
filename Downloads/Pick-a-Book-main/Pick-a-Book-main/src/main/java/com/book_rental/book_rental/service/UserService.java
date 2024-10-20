package com.book_rental.book_rental.service;

import com.book_rental.book_rental.dto.UserDto;

public interface UserService {

    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);

}
