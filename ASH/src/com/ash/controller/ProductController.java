package com.ash.controller;

import java.util.HashSet;
import java.util.Set;

import com.ash.model.CategoryDtoReq;
import com.ash.model.Product;
import com.ash.model.ProductDtoRes;
import com.ash.model.User;


public class ProductController  {
	public ProductController(){
		this.productDao=new ProductDao();
	}
	private ProductDao productDao;
	private UserDao userDao;
   

    User userr;
    public boolean addproduct(Product product) {
    	
    	
    	
    	
    	ProductDtoRes ProductRes =  productDao.find(product.getId());
    			
        if(((ProductDtoRes) ProductRes).isResult()){
            //if product already exists
            return false;
        }else{
        	
			productDao.create(product);
            return true;
          
      
        }}
    
    
    public ProductDtoRes getProductById(int id) {
		ProductDtoRes product = new ProductDtoRes();
		product=productDao.find(id);
		return product;
	} 
    public Set<Product> ListOfProducts(CategoryDtoReq category){
		Set<Product> productss =new HashSet<Product>();
		
		Set<ProductDtoRes> products=productDao.findAllProducts(category);
		
		for(ProductDtoRes prod:products){
			Product product= new Product();
			product=prod.getProduct();
			productss.add(product);
			
		}
		return productss;
	}     

        
        public void close(){
        	
        	userDao.close();
        }






}




