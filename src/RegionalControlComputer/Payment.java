package RegionalControlComputer;

class Payment {
    private double amount;
    
    //constructor
    public Payment(){
        amount=0.0;
    }
    
    //
    public Payment(double paymentAmount) {
        amount = paymentAmount;
    }

    //accessor for payment
    public double getAmount() {
    return amount;
    }
    
    //mutator for payment
    public void setAmount(double paymentAmount) {
        amount = paymentAmount;
    }

    public String submitPayment() {
        return "Payment submitted";
    }


}