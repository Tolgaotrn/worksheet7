import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Product;
import org.junit.jupiter.api.Test;
public class ProductJavaTest {
    @Test 
    public void SameTitle() {
        Product product = new Product("Dyson", 123);
        String name = "Dyson";

        assertEquals(product.getTitle(), name);
        
    }
    @Test 
    public void SamePrice() {
        Product product2 = new Product("Dyson", 123);
        double price = 123;

        assertEquals(product2.getPrice(), price);
        
    }
}
