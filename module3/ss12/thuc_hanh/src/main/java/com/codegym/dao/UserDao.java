package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserDao implements IUserDAO {
    @Override
    public void insertUser(User user) throws SQLException {
        
    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }
}
