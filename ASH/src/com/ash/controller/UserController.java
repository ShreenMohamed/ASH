package com.ash.controller;

import com.ash.model.User;
import com.ash.model.UserDtoReq;
import com.ash.model.UserDtoRes;

public class UserController {
	public UserController(){
		this.userDao=new UserDao();
	}
	private UserDao userDao;
    public boolean registerUser(User user) {
        UserDtoRes UserRes = userDao.find(user.getName());
        if(UserRes.isResult()){
            //if user already exists
            return false;
        }else{
            userDao.create(user);
            return true;
      
        }

    }
    public boolean loginUser(UserDtoReq user) {
        UserDtoRes UserRes = userDao.find(user.getName());
        if(UserRes.isResult() && UserRes.getUser().getName().equals(user.getName()) && UserRes.getUser().getPassword().equals(user.getPassword())){
            //if user with the same login registered already
            return true;
        }else{
            return false;
      
        }

    }
    public void close(){
    	
    	userDao.close();
    }
}
