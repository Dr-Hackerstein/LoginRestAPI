package com.example.demo.model;
import java.util.List;

import jakarta.persistence.*;
@Entity
@Table(name="shoppingcart")
public class ShoppingCart {
	@Id
	private int shopid;
	
	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public List<Product> getProdlist() {
		return prodlist;
	}

	public void setProdlist(List<Product> prodlist) {
		this.prodlist = prodlist;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="shopid")
	private List<Product> prodlist;

}
