package com.example.springtest.model.Mapper;

import com.example.springtest.entity.User;
import com.example.springtest.model.DTO.UserDTO;

public class UserMapper {
    public static UserDTO toUserDTO(User user) {
        UserDTO result = new UserDTO();
        result.setId(user.getId());
        result.setName(user.getName());
        result.setEmail(user.getEmail());
        result.setPhone(user.getPhone());
        result.setUserName(user.getUserName());
        return result;
    }
}
