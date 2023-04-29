package main;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(1);
        cart.addProduct(new Product(1, ProductType.APPLE_PENCIL));
    }
}

