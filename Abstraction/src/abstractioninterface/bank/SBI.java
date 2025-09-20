package abstractioninterface.bank;

public class SBI implements Bank {
    @Override
    public double getLoanRateOfIntrest() {
        return (10.05);
    }

    @Override
    public double getSavingAcRateOfIntrest() {
        return (2.50);
    }
}
