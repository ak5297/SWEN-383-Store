package RegionalControlComputer;

public class RCCTester {
    //main method
    public static void main(String[] args) {

        CreditCardPayment creditOne = new CreditCardPayment();

        creditOne.submitPayment("1234-5678-9012-3456");
//        Payment cash = new CashPayment();
//        Payment credit = new CreditCardPayment(0.0, "name", "expDate", "cardNum");
//        Payment debit = new DebitCardPayment(0.0, "name", "expDate", "cardNum");
//
//        System.out.println("Cash details:");
//        cash.paymentDetails();
//        System.out.println();
//
//        System.out.println("Credit Card details:");
//        credit.paymentDetails();
//        System.out.println();
//
//        System.out.println("Debit details:");
//        debit.paymentDetails();
//        System.out.println();
    }

}
