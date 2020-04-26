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
    public double getPayment() {
    return amount;
    }
    
    //mutator for payment
    public void setPayment(double paymentAmount) {
        amount = paymentAmount;
    }
}