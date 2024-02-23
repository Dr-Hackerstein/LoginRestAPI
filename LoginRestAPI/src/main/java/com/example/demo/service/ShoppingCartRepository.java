package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Integer> {
	

}
