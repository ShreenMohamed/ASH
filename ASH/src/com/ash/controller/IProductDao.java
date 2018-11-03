package com.ash.controller;

import java.util.Set;

import com.ash.model.CategoryDtoReq;
import com.ash.model.Product;
import com.ash.model.ProductDtoReq;
import com.ash.model.ProductDtoRes;
import com.ash.model.UserDtoReq;


public interface IProductDao {
	Set<ProductDtoRes> findAll();
	Set<ProductDtoRes> findAllProducts(CategoryDtoReq category);
	Set<ProductDtoRes> findAllProducts(UserDtoReq user);
    ProductDtoRes create(Product product);
    
    boolean delete(String name);
    Product update(ProductDtoReq user);
	ProductDtoRes find(int id);
	ProductDtoRes updateProductStatus(int id);
}
