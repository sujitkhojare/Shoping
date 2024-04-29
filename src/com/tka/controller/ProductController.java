package com.tka.controller;
import com.tka.dao.ProductDAO;
import com.tka.entity.Cart;
import com.tka.entity.Product;
import com.tka.services.CartService;
public class ProductController {
	public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        CartService cartService = new CartService();

        Product product1 = productDAO.createProduct("Product 1", 10.99);
        Product product2 = productDAO.createProduct("Product 2", 20.49);

        Cart cart = new Cart();
        cartService.addProductToCart(cart, product1);
        cartService.addProductToCart(cart, product2);

        double total = cartService.calculateCartTotal(cart);

        System.out.println("Products added to cart:");
        for (Product product : cart.getItems()) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }

        System.out.println("Total cart value: " + total);
    }
}