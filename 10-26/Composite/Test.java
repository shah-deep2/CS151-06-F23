package Composite;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();

        // Add Product to items
        Product product1 = new Product();
        order.addProduct(product1);

        // Add Bundle to items
        Bundle bundle1 = new Bundle();
        Product product2 = new Product();
        bundle1.addProduct(product2);

        order.addProduct(bundle1);

        // You can add more products or bundles as needed.
    }
}
