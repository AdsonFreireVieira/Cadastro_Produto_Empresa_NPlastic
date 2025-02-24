package com.NPlastic.service;

import com.NPlastic.Entity.User;

import java.util.List;

public interface userService {

    public  User create(User user);

    public User update(User user);

    public List<User> ListarUser();

    public void deletarUser(int id);

    public User BuscarPorID(int id);
}
