package java_4.testing;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Receipt {
    private SalesCustomer customer;
    private List<Product> taxedCart;
    private double totalTax;

    static Logger logger = LoggerFactory.getLogger(Receipt.class);

    public Receipt(SalesCustomer customer) {
        this.customer = customer;
        taxedCart = new ArrayList<>();
        totalTax = 0;
    }

    public void printReceipt() {
        int index = 0;
        for (Product product : customer.getCart())
        {
            taxedCart.add(new Product(product.getName(), product.getPrice(), product.getType(), product.isImported()));
            if (!isExemptItem(product))
            {
                taxedCart.get(index).setPrice(tenPercentTax(product.getPrice()));
            }
            if (product.isImported())
            {
                if (taxedCart.get(index).getPrice() != product.getPrice())
                {
                    taxedCart.get(index).setPrice(fivePercentTax(product.getPrice()) + (taxedCart.get(index).getPrice() - product.getPrice()));
                }
                else {
                    taxedCart.get(index).setPrice(fivePercentTax(product.getPrice()));
                }
            }
            DecimalFormat f = new DecimalFormat("#0.00");
            logger.info("1 " + taxedCart.get(index).getName() + ": " + f.format(taxedCart.get(index).getPrice()));
            index++;
        }
        logger.info("Sales Taxes: " + getTotalTax());
        logger.info("Total: " + getTotalCartAfterTax());
    }

    public Boolean isExemptItem(Product product) {
        if(product.getType().equals("book") || product.getType().equals("food") || product.getType().equals("medical"))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public double tenPercentTax(double price) {
        double taxedPrice = Math.round((price * 0.1) * 20.0) / 20.0;
        totalTax+= taxedPrice;
        DecimalFormat f = new DecimalFormat("#0.00");
        return Double.parseDouble(f.format(price + taxedPrice));
    }

    public double fivePercentTax(double price) {
        double taxedPrice = Math.round((price * 0.05) * 20.0) / 20.0;
        totalTax+= taxedPrice;
        DecimalFormat f = new DecimalFormat("#0.00");
        return Double.parseDouble(f.format(price + taxedPrice));
    }

    public String getTotalTax() {
        DecimalFormat f = new DecimalFormat("#0.00");
        return f.format(totalTax);
    }

    public double getTotalCartAfterTax() {
        double totalCartAfterTax = 0;
        for (Product product : taxedCart)
        {
            totalCartAfterTax+= product.getPrice();
        }
        DecimalFormat f = new DecimalFormat("#0.00");
        return Double.parseDouble(f.format(totalCartAfterTax));
    }

}
