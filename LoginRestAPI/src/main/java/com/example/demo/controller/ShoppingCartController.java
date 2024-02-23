package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;
import com.example.demo.service.ProductService;
import com.example.demo.service.ShoppingCartService;

@RestController
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    @Autowired
    private ProductService productService; // Inject ProductService

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/add-product")
    public void addProductToCart(@RequestBody ShoppingCart shoppingCart,
                                 @RequestParam("productId") int productId,
                                 @RequestParam("quantity") int quantity) {
        // Retrieve the product from the database using productId
        Product product = productService.getProductById(productId);
        
        // Add the product to the shopping cart
        shoppingCartService.addProductToCart(shoppingCart, product, quantity);
    }

    @PostMapping("/increase-quantity")
    public void increaseQuantity(@RequestBody ShoppingCart shoppingCart,
                                 @RequestParam("productId") int productId,
                                 @RequestParam("quantity") int quantity) {
        // Retrieve the product from the database using productId
        Product product = productService.getProductById(productId);
        
        // Increase the quantity of the product in the shopping cart
        shoppingCartService.increaseQuantity(shoppingCart, product, quantity);
    }

    @PostMapping("/decrease-quantity")
    public void decreaseQuantity(@RequestBody ShoppingCart shoppingCart,
                                 @RequestParam("productId") int productId,
                                 @RequestParam("quantity") int quantity) {
        // Retrieve the product from the database using productId
        Product product = productService.getProductById(productId);
        
        // Decrease the quantity of the product in the shopping cart
        shoppingCartService.decreaseQuantity(shoppingCart, product, quantity);
    }
}

