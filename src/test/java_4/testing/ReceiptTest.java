package java_4.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceiptTest {

    @Test
    void receiptTest() {

    }

    @Test
    void isExemptItemTest() {
        SalesCustomer customer = new SalesCustomer("Bob");
        Product product = new Product("Book", 12.49, "book", false);
        customer.addProductToCart(product);

        Receipt receipt = new Receipt(customer);

        Boolean expected = true;
        Boolean actual = receipt.isExemptItem(product);
        assertEquals(expected, actual);
    }

    @Test
    void tenPercentTaxTest() {
        SalesCustomer customer = new SalesCustomer("Bob");
        Product product = new Product("CD", 14.99, "music", false);
        customer.addProductToCart(product);

        Receipt receipt = new Receipt(customer);

        double expected = 16.49;
        double actual = receipt.tenPercentTax(product.getPrice());

        assertEquals(expected, actual);
    }

    @Test
    void fivePercentTax() {
        SalesCustomer customer = new SalesCustomer("Bob");
        Product product = new Product("imported box of chocolates", 11.25, "food", true);
        customer.addProductToCart(product);

        Receipt receipt = new Receipt(customer);

        double expected = 11.8;
        double actual = receipt.fivePercentTax(product.getPrice());

        assertEquals(expected, actual);
    }

//    @Test
//    void nearestDecimalTest() {
//        Receipt receipt = new Receipt(null);
//        double expected = 0.9;
//        double actual = receipt.nearestDecimal(0.875);
//        assertEquals(expected, actual);
//    }
}
