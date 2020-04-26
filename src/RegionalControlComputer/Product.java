package RegionalControlComputer;

public class Product {
    private String title;
    private String uniqueId;
    private String RFIDTag;
    private int quantity;
    private double price;
    private String storeID;
    private String customerID;
    private String dvdID;
    private String returnDate;
    private String rentDate;
    private boolean rentedStatus;
    private boolean returnedStatus;
    private boolean reservationStatus;
    
    public Product(){
        
    }
    
    //accessor for product info
    public void getProductInfo(String title){
        System.out.println("Title: " + title);
    }
    
    //display alert message
    public String alertMessage(){
        return "Store ID: " + storeID + "DVD/CD ID: " + dvdID + "Quantity: " + quantity;
    }
    
    //display log entry
    public String logEntity(){
        return "Store ID: " + storeID + "Customer ID: " + customerID + "DVD/CD ID: " + dvdID + "Return Date: " + returnDate + "Renting Date: " + rentDate;
       
    }
    
    //check rental, returned, and reservation status
    public Boolean rentalStatus(){
        if(rentedStatus == true) {
            System.out.println("This item is rented out.");
        } // else if(rentedStatus == false) {
//             System.out.println("This item is not rented out.");
//         } if(returnedStatus == true) {
//             System.out.println("This item is returned.");
//         } else if(returnedStatus == false) { 
//             System.out.println("This item is not returned.");
//         } if(reservationStatus == true) {
//             System.out.println("This item is reserved.");
//         } else if(reservationStatus == false) {
//             System.out.println("This item is not reserved.");
//         }  
           return false;            
    }
}
