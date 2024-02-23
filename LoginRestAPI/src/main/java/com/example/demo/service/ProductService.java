package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
	
    List<Product> getAllProducts();
    
    List<Product> getProductsByCategory(String category);
    
    List<Product> getProductsSortedByPriceAsc();
    
    List<Product> getProductsSortedByPriceDesc();

	Product getProductById(int productId);
	
	Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(int productId);
    
    //New method for stocks
    int getProductStock(int productId);
    
    
}

