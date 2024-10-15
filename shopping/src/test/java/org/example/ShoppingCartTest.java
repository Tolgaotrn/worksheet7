package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Product;
import org.example.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;

public class ShoppingCartTest {
    
    private ShoppingCart cart;
    private Product product1;
    private Product product2;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
        product1 = new Product("Dyson", 123);
        product2 = new Product("Bosch", 1244);
    }

    @Test
    public void testAddItem() {
        cart.addItem(product1);
        assertEquals(1, cart.getItemCount());
        assertEquals(123, cart.getBalance(), 0.001);
    }

    @Test
    public void testRemoveItem() throws ProductNotFoundException{
        cart.addItem(product1);
        cart.removeItem(product1);
        assertEquals(0, cart.getItemCount());
    }
}