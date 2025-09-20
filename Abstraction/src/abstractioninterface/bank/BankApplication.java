package abstractioninterface.bank;

public class BankApplication {
    public static void main(String[] args){
        Bank sbi = new SBI();
        System.out.println("SBI intrest for Saving Account:"+sbi.getSavingAcRateOfIntrest());
        System.out.println("SBI intrest for Loan:"+sbi.getLoanRateOfIntrest());
        System.out.println("-----------------");

        Bank hdfc = new HDFC();
        System.out.println("HDFC intrest for Saving Account:"+hdfc.getSavingAcRateOfIntrest());
        System.out.println("HDFC intrest for Loan:"+hdfc.getLoanRateOfIntrest());
        System.out.println("-----------------");

        Bank bob = new BOB();
        System.out.println("BOB intrest for Saving Account:"+bob.getSavingAcRateOfIntrest());
        System.out.println("BOB intrest for Loan:"+bob.getLoanRateOfIntrest());

    }

}
