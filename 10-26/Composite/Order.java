package Composite;
import java.util.ArrayList;
import java.util.List;

public class Order {
    List<ProductInt> items;
    
    public Order() {
        items = new ArrayList<>();
    }

    public void addProduct(ProductInt product) {
        items.add(product);
    }
}
