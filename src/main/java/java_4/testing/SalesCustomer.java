package main.java.java_4.testing;

import java.util.ArrayList;
import java.util.List;

public class SalesCustomer {
    private String name;
    private List<Product> cart;

    public SalesCustomer(String name) {
        this.name = name;
        cart = new ArrayList();
    }
}
