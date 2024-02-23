package com.example.demo.service;

import com.example.demo.model.Admin;

public interface AdminService {
	
    Admin login(String adminname, String password);
    void logout(Admin user);

}
