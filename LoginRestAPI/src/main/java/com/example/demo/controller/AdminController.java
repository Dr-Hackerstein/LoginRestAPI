package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

import com.example.demo.service.ProductService;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
    private AdminService adminService;
	
	@Autowired
	private ProductService productService;

    @PostMapping("/loginadmin")
    public Admin login(@RequestParam String adminname, @RequestParam String password) {
        return adminService.login(adminname, password);
    }

    @PostMapping("/logoutadmin")
    public void logout(@RequestBody Admin admin) {
        adminService.logout(admin);
    }
    
    @GetMapping("/products/{productId}/stock")
    public int getProductStock(@PathVariable int productId) {
        return productService.getProductStock(productId);
    }
}
