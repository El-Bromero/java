package java_4.testing;

public class SalesTaxApp {
    public static void main(String[] args) {
        SalesCustomer customer1 = new SalesCustomer("Bob");
        Product book = new Product("Book", 12.49, "book", false);
        Product cd = new Product("CD", 14.99, "music", false);
        Product chocolateBar = new Product("Chocolate Bar", 0.85, "food", false);
        customer1.addProductToCart(book);
        customer1.addProductToCart(cd);
        customer1.addProductToCart(chocolateBar);
        Receipt receipt1 = new Receipt(customer1);
        receipt1.printReceipt();
        System.out.println();

        SalesCustomer customer2 = new SalesCustomer("Rob");
        Product importedChocolates = new Product("imported box of chocolates", 10.00, "food", true);
        Product importedPerfume = new Product("imported bottle of perfume", 47.50, "fragrance", true);

        customer2.addProductToCart(importedChocolates);
        customer2.addProductToCart(importedPerfume);
        Receipt receipt2 = new Receipt(customer2);
        receipt2.printReceipt();
        System.out.println();

        SalesCustomer customer3 = new SalesCustomer("Ron");
        Product importedPerfume2 = new Product("imported bottle of perfume", 27.99, "fragrance", true);
        Product perfume = new Product("bottle of perfume", 18.99, "fragrance", false);
        Product headachePills = new Product("packet of headache pills", 9.75, "medical", false);
        Product importedChocolates2 = new Product("imported box of chocolates", 11.25, "food", true);

        customer3.addProductToCart(importedPerfume2);
        customer3.addProductToCart(perfume);
        customer3.addProductToCart(headachePills);
        customer3.addProductToCart(importedChocolates2);
        Receipt receipt3 = new Receipt(customer3);
        receipt3.printReceipt();

    }
}
