package com.book_rental.book_rental.mapper;

import com.book_rental.book_rental.dto.UserDto;
import com.book_rental.book_rental.entity.User;

public class UserMapper {

    public static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.userId(),
                userDto.username(),
                userDto.password(),
                userDto.email(),
                userDto.createdAt(),
                userDto.updatedAt(),
                userDto.lentBooks(),
                userDto.borrowedBooks(),
                userDto.willingToSell()
        );
        return user;
    }

    public static UserDto mapToDto(User user) {
        UserDto userDto = new UserDto(
                user.getUserid(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getCreatedAt(),
                user.getUpdatedAt(),
                user.getLentBooks(),
                user.getBorrowedBooks(),
                user.getWillingToSell()
        );
        return userDto;
    }
}
