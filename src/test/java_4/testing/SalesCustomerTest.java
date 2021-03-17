package java_4.testing;

import main.java.java_4.testing.SalesCustomer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCustomerTest {

    @Test
    void checkSalesCustomerName() {
        SalesCustomer customer = new SalesCustomer("Bob");

        String expected = "Bob";
        String actual = customer.getName();

        assertEquals(expected,actual);
    }
}
