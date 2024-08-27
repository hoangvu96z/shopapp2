package com.project.shopapp2.services;

import com.project.shopapp2.dtos.UserDTO;
import com.project.shopapp2.exceptions.DataNotFoundException;
import com.project.shopapp2.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws DataNotFoundException;
    String login(String phoneNumber, String password);
}
