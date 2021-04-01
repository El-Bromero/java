package java_4.testing;

import java.util.ArrayList;
import java.util.List;

public class SalesCustomer {
    private String name;
    private List<Product> cart;

    public SalesCustomer(String name) {
        this.name = name;
        cart = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public List<Product> getCart() {
        return cart;
    }

    public Product addProductToCart(Product product) {
        if(cart.add(product)) {
            return product;
        }
        else {
            return null;
        }
    }

    public Boolean clearCart() {
        cart.clear();
        return cart.isEmpty();
    }

}
