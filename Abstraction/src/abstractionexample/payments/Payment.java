package abstractionexample.payments;

public abstract class Payment {
    String transactionId;

    Payment(String transactionId) {
        this.transactionId = transactionId;
    }

    abstract void pay(double amount);

    void printrecipt(double amount){
        System.out.println("Transaction Id:"+ transactionId);
        System.out.println("Payment:"+ amount);
        System.out.println("Transaction Successfully Done!");
    }

}
