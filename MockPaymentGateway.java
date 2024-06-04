public interface PaymentGateway {
    void processPayment(double amount);
}

public class MockPaymentGateway implements PaymentGateway {
    public void processPayment(double amount) {
    }
}
