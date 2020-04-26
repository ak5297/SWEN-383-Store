package RegionalControlComputer;

public class Charges implements RCC {

   private double totalLateCharge;
   private double dvdRentalCharge;
   private double cdRentalCharge;
   
    
    public Charges(){
        
    }
    
    //accessor for late charge
    public double totalLateCharge(){
        return totalLateCharge();
    }
    
    //mutator for late charge
    public void applyLateCharge(double lateCharge){
        totalLateCharge = lateCharge;
    }
}
