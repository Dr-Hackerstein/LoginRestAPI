package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Override
    public void addProductToCart(ShoppingCart shoppingCart, Product product, int quantity) {
        // Check if the product already exists in the shopping cart
        boolean productExists = shoppingCart.getProdlist().stream()
                .anyMatch(p -> p.getProductid() == product.getProductid());

        if (productExists) {
            // If the product exists, update its quantity
            shoppingCart.getProdlist().forEach(p -> {
                if (p.getProductid() == product.getProductid()) {
                    p.setQuantity(p.getQuantity() + quantity);
                }
            });
        } else {
            // If the product doesn't exist, add it to the shopping cart
            product.setQuantity(quantity);
            shoppingCart.getProdlist().add(product);
        }

        // Save the updated shopping cart
        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public void increaseQuantity(ShoppingCart shoppingCart, Product product, int quantity) {
        shoppingCart.getProdlist().forEach(p -> {
            if (p.getProductid() == product.getProductid()) {
                p.setQuantity(p.getQuantity() + quantity);
            }
        });

        // Save the updated shopping cart
        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public void decreaseQuantity(ShoppingCart shoppingCart, Product product, int quantity) {
        shoppingCart.getProdlist().forEach(p -> {
            if (p.getProductid() == product.getProductid()) {
                int newQuantity = p.getQuantity() - quantity;
                p.setQuantity(newQuantity > 0 ? newQuantity : 0);
            }
        });

        // Save the updated shopping cart
        shoppingCartRepository.save(shoppingCart);
    }
}
