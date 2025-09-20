package abstractionexample.payments;

public class UpiPayment extends Payment {
    UpiPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    void pay(double amount) {
        System.out.println("Paying " + amount + " using UpiPayment");
        printrecipt(amount);

    }
}
