package org.bos.Shop.services;

import java.util.ArrayList;

import org.bos.Shop.entities.UserEntity;
import org.bos.Shop.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDto createUser(UserDto userDto);
    UserDto getUser(String email);
    UserDto getUserByUserId(String idUser);
    UserDto updateUser(String id,UserDto userDto);
    void deleteUser(String id);
    ArrayList<UserEntity> listUsers();
}
