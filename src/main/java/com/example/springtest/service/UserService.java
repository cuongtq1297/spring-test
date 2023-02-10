package com.example.springtest.service;

import com.example.springtest.entity.User;
import com.example.springtest.model.DTO.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDTO> getListUser();
    public UserDTO getUserById(int id);
    public List<UserDTO> searchUsers(String name);
}
