package RegionalControlComputer;

public class DebitCardPayment extends Payment {

    public Boolean authorizeDebitCardPayment(String debitCardNum) {
        // Reach out to bank and confirm valid card
        if (debitCardNum == cardNo) {
            System.out.println("Debit card verified");
            return true;
        } else {
            System.out.println("Debit card not verified with provider");
            return false;
        }
    }

    public String submitPayment(String inCardNum) {
        authorizeDebitCardPayment(inCardNum);
        return "Payment submitted";
    }

}
