package com.NPlastic.service;

import com.NPlastic.Entity.User;
import com.NPlastic.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements  userService{

    @Autowired
    private userRepository repository;


    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> ListarUser() {
        return (List<User>) repository.findAll();
    }

    @Override
    public void deletarUser(int id) {
       repository.deleteById(id);
    }

    @Override
    public User BuscarPorID(int id) {
        return repository.findById(id).orElse(null);
    }
}
