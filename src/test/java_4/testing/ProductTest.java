package java_4.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProductTest {

    @Test
    void productTest() {
        Product product = new Product("Book", 12.49, "book", false);

        String expectedName = "Book";
        String actualName = product.getName();
        assertEquals(expectedName, actualName);

        double expectedPrice = 12.49;
        double actualPrice = product.getPrice();
        assertEquals(expectedPrice, actualPrice);

        String expectedType = "book";
        String actualType = product.getType();
        assertEquals(expectedType, actualType);

        Boolean actualIsImported = product.isImported();
        assertFalse(actualIsImported);
    }
}
