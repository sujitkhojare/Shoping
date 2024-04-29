package com.tka.dao;
import com.tka.entity.Product;
public class ProductDAO {
	   public Product createProduct(String name, double price) {
	        return new Product(name, price);
	    }
	}
