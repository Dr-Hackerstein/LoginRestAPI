package com.example.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name="userdata")
public class User {
	
@Id
private int userid;

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Column(name="UserName")
private String username;

@Column(name="password")
private String password;

}

