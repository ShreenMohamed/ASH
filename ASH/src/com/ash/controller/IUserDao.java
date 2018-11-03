package com.ash.controller;

import java.util.Set;

import com.ash.model.ProductDtoRes;
import com.ash.model.User;
import com.ash.model.UserDtoReq;
import com.ash.model.UserDtoRes;

public interface IUserDao {
	 Set<UserDtoRes> findAll();

	    UserDtoRes create(User user);

	    boolean delete(String name);

	    UserDtoRes find(String name);

	    User update(UserDtoReq user);


		Set<ProductDtoRes> findAllProducts(UserDtoReq user);  
}
