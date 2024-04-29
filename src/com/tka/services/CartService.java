package com.tka.services;
import com.tka.entity.Cart;
import com.tka.entity.Product;
public class CartService {
	    public void addProductToCart(Cart cart, Product product) {
	        cart.addProduct(product);
	    }

	    public double calculateCartTotal(Cart cart) {
	        double total = 0;
	        for (Product product : cart.getItems()) {
	            total += product.getPrice();
	        }
	        return total;
	    }
	}
