public interface Order {
    void processOrder();
}

public class Cart implements Order {
    private List<Product> items;
    
    public Cart() {
        items = new ArrayList<>();
    }
    
    public void addItem(Product product) {
        items.add(product);
    }
    
    public void processOrder() {
        
    }
}

public class OrderFactory {
    public Order createOrder(String type) {
        if (type.equalsIgnoreCase("cart")) {
            return new Cart();
        }
        
        return null;
    }
}
