package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductName")
public class Product {

	@Id
	/*
	 * @Id: This annotation marks the primary key field of the entity. 
	 * In this case, productid is the primary key.
	 */
	
	/*
	 * These lines define the fields (attributes) of the Product class. 
	 * Each field represents a column in the database table mapped to this entity.
	 */
	@Column(name="Productid")
	private int productid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Column(name="Productname")
	private String productname;
	@Column(name="Price")
	private double price;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="category")
	private String category;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
