package main;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int cartId;
    private List<Product> productList;

    public Cart(final int cartId, final List<Product> productList) {
        this.cartId= cartId;
        this.productList = productList;
    }
    public Cart(final int cartId) {
        this.cartId= cartId;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(final Product product) {
        this.productList.add(product);
    }

}