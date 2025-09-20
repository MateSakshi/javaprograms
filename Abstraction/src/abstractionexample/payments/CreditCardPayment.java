package abstractionexample.payments;

public class CreditCardPayment extends Payment {
    CreditCardPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        printrecipt(amount);

    }
}
