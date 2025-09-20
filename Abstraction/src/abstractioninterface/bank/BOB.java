package abstractioninterface.bank;

public class BOB implements Bank {
    @Override
    public double getLoanRateOfIntrest() {
        return (12.85);
    }

    @Override
    public double getSavingAcRateOfIntrest() {
        return (2.75);
    }
}
