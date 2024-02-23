package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
	Admin findByAdminnameAndPassword(String adminname, String password);

}
