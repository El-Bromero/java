package java_4.testing;

import main.java.java_4.testing.Product;
import main.java.java_4.testing.SalesCustomer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCustomerTest {

    @Test
    void checkSalesCustomerName() {
        SalesCustomer customer = new SalesCustomer("Bob");

        String expected = "Bob";
        String actual = customer.getName();

        assertEquals(expected,actual);
    }

    @Test
    void checkSalesCustomerCart() {
        SalesCustomer customer = new SalesCustomer("Bob");

        List<Product> expected = new ArrayList<>();
        List<Product> actual = customer.getCart();

        assertEquals(expected, actual);
    }

    @Test
    void addProductToSalesCustomerCart() {
        SalesCustomer customer = new SalesCustomer("Bob");
        Product expected = new Product("Toothbrush", 4.99, "Self-care");
        Product actual = customer.addProductToCart(expected);

        assertEquals(expected, actual);
    }

    @Test
    void clearSalesCustomerCart() {
        SalesCustomer customer = new SalesCustomer("Bob");
        customer.addProductToCart(new Product("Toothbrush", 4.99, "Self-care"));
        Boolean expected = true;
        Boolean actual = customer.clearCart();

        assertEquals(expected, actual);
    }
}
