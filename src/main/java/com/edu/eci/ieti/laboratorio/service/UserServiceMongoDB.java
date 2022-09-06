package com.edu.eci.ieti.laboratorio.service;

import com.edu.eci.ieti.laboratorio.DTO.UserDto;
import com.edu.eci.ieti.laboratorio.entity.User;
import com.edu.eci.ieti.laboratorio.exception.UserException;
import com.edu.eci.ieti.laboratorio.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMongoDB   implements UserService{

    private UserRepository userRepository;

    public UserServiceMongoDB(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) throws UserException {
        return userRepository.save(user);
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(String id) throws UserException {
        userRepository.deleteById(id);

    }

    @Override
    public User update(User user, String userId) throws UserException {
        return null;
    }

    @Override
    public List<UserDto> convert(List<User> users) {
        return null;
    }
}
