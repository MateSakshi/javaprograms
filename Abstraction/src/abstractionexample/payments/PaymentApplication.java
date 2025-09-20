package abstractionexample.payments;

public class PaymentApplication {
    public static void main(String[] args){
        Payment creditcardpayment = new CreditCardPayment("TNXNO101");
        creditcardpayment.pay(10000);
        System.out.println("--------------------");

        Payment upipayment = new UpiPayment("TNXNO102");
        upipayment.pay(6000);

    }
}
