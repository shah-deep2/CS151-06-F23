package Composite;
import java.util.ArrayList;
import java.util.List;

public class Bundle implements ProductInt {
    List<Product> products;

    public Bundle() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
