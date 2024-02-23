package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Endpoint to get all products
    @GetMapping("/retrieveProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Endpoint to get products by category
    @GetMapping("/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }

    // Endpoint to sort products by price in ascending order
    @GetMapping("/sort/price-asc")
    public List<Product> getProductsSortedByPriceAsc() {
        return productService.getProductsSortedByPriceAsc();
    }

    // Endpoint to sort products by price in descending order
    @GetMapping("/sort/price-desc")
    public List<Product> getProductsSortedByPriceDesc() {
        return productService.getProductsSortedByPriceDesc();
    }
}
