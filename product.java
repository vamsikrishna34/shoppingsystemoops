public class Product {
    private String name;
    private double price;
    
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        
    }
    
    
}

public class product {
    private List<Product> products;
    
    public product() {
        products = new ArrayList<>();
        
    }
    
    public List<Product> getAllProducts() {
        return products;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    
}
