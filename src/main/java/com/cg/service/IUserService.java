package com.cg.service;

import java.util.List;

import com.cg.entity.User;
import com.cg.exception.UserNotFoundException;

public interface IUserService {
	public String validateUser(int userId ,String password);
	public List<User> addUser(User user) ;
	public List<User> removeUser(int id);
	public String SignOut(String message);
	public List<User> updatePassword(int id, String password) throws UserNotFoundException;

}
