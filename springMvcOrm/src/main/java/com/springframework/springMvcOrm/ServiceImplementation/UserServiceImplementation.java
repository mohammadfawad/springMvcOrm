package com.springframework.springMvcOrm.ServiceImplementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.springMvcOrm.DAO.UserDAO;
import com.springframework.springMvcOrm.Entities.User;
import com.springframework.springMvcOrm.Service.UserService;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public int addUser(User user) {
		// TODO Auto-generated method stub: Business Logic
		return this.userDAO.createUser(user);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	

	
}
