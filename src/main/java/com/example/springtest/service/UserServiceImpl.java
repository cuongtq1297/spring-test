package com.example.springtest.service;

import com.example.springtest.entity.User;
import com.example.springtest.exception.NotFoundException;
import com.example.springtest.model.DTO.UserDTO;
import com.example.springtest.model.Mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "cuong", "abc@a.com", "0123", "cuonguser", "123456"));
        users.add(new User(2, "cuong", "abc@a.com", "0123", "cuonguser", "123456"));
        users.add(new User(3, "hoai", "abc@a.com", "0123", "cuonguser", "123456"));
        users.add(new User(4, "cuong", "abc@a.com", "0123", "cuonguser", "123456"));
        users.add(new User(5, "cuong", "abc@a.com", "0123", "cuonguser", "123456"));
    }

    @Override
    public List<UserDTO> getListUser() {
        List<UserDTO> result = new ArrayList<>();
        for (User user : users) {
            result.add(UserMapper.toUserDTO(user));
        }
        return result;
    }

    @Override
    public UserDTO getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return UserMapper.toUserDTO(user);
            }
        }
        throw new NotFoundException("Khong tim thay");
    }

    @Override
    public List<UserDTO> searchUsers(String name) {
        List<UserDTO> result = new ArrayList<>();
        for (User user : users) {
            if (user.getName().contains(name)) {
                result.add(UserMapper.toUserDTO(user));
            }
        }
        return result;
    }
}
