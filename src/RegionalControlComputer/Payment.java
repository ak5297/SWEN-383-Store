package RegionalControlComputer;

public interface Payment {
    private double amount;
    
    //constructor
    public Payment(){
        amount=0.0;
    }
    
    //
    public Payment(double paymentAmount)
    {
        amount = paymentAmount;
    }

    //accessor for payment
    public double getPayment()
    {
    return amount;
    }
    
    //mutator for payment
    public void setPayment(double paymentAmount)
    {
        amount = paymentAmount;
    }
    //main method
    public static void main(String[] args)
    {
        Payment cash = new CashPayment();
        Payment credit = new CreditCardPayment(0.0, "name", "expDate", "cardNum");
        Payment debit = new DebitCardPayment(0.0, "name", "expDate", "cardNum");
        
        System.out.println("Cash details:");
        cash.paymentDetails();
        System.out.println();
    
        System.out.println("Credit Card details:");
        credit.paymentDetails();
        System.out.println();
    
        System.out.println("Debit details:");
        debit.paymentDetails();
        System.out.println();
    }
}