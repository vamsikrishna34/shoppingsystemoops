public class Main {
    public static void main(String[] args) {
        
        User userAuthentication = User.getInstance();
        product productCatalog = new product();
        OrderFactory orderFactory = new OrderFactory();
        PaymentGateway paymentGateway = new MockPaymentGateway();
        Logger logger = Logger.getInstance();
        
        
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        userAuthentication.addUser(user1);
        userAuthentication.addUser(user2);
        
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 20.0);
        productCatalog.addProduct(product1);
        productCatalog.addProduct(product2);
        
        String username = "user1";
        String password = "password1";
        
        if (userAuthentication.authenticateUser(username, password)) {
            System.out.println("User authenticated successfully.");
            Order cart = orderFactory.createOrder("cart");
            cart.addItem(product1);
            cart.addItem(product2);
            cart.processOrder();
            
            
            double amount = 30.0; 
            paymentGateway.processPayment(amount);
            
            
            logger.log("Order placed successfully for user: " + username);
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
