package RegionalControlComputer;

public class CreditCardPayment extends Payment {
   private String cardNo;
    public CreditCardPayment() {
        
    }

    public Boolean authorizeCreditCardPayment(String creditCardNum) {
        // Reach out to bank and confirm valid card
        if (creditCardNum == cardNo) {
            System.out.println("Credit card verified");
            return true;
        } else {
            System.out.println("Credit card not verified with provider");
            return false;
        }
    }

    public String submitPayment(String inCardNum) {
        authorizeCreditCardPayment(inCardNum);
        return "Payment submitted";
    }
}
