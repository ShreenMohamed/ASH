package com.ash.controller;

import java.util.Set;

import com.ash.model.CategoryDtoRes;

public interface ICategoryDao {
	Set<CategoryDtoRes> findAll();
	 CategoryDtoRes find(String name);
}
