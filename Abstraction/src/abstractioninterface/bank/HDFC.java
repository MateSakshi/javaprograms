package abstractioninterface.bank;

public class HDFC implements Bank {
    @Override
    public double getLoanRateOfIntrest() {
        return (9.99);
    }

    @Override
    public double getSavingAcRateOfIntrest() {
        return (3.00);
    }
}
