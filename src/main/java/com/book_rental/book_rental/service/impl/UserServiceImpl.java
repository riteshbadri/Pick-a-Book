package com.book_rental.book_rental.service.impl;

import com.book_rental.book_rental.dto.UserDto;
import com.book_rental.book_rental.entity.User;
import com.book_rental.book_rental.mapper.UserMapper;
import com.book_rental.book_rental.repository.UserRepository;
import com.book_rental.book_rental.service.UserService;
import org.springframework.stereotype.Service;
@Service

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        return UserMapper.mapToDto(user);
    }


}
