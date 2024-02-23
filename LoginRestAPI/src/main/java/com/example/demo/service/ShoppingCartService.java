package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;

public interface ShoppingCartService {
    void addProductToCart(ShoppingCart shoppingCart, Product product, int quantity);
    void increaseQuantity(ShoppingCart shoppingCart, Product product, int quantity);
    void decreaseQuantity(ShoppingCart shoppingCart, Product product, int quantity);
}
