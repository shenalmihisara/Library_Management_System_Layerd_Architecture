package service.impl;

import DB.dbConnection;
import model.LoginEntity;
import repository.LoginRepository;
import service.LoginService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginServiceImpl implements LoginService {

    LoginRepository loginRepository = new LoginRepository();

    @Override
    public boolean checkLoginDetails(String userName, String password) {

        LoginEntity loginEntity = loginRepository.checkLo0ginDetails(userName, password);

        if (loginEntity.getUserName().equals(userName) & loginEntity.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
