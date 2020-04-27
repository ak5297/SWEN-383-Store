package RegionalControlComputer;

public class Customer implements Account {
    Scanner sc = new Scanner (System.in);
    
    //initialize customer information
    String name = "";
    String CC = "";
    String email = "";
    String address = "";
    
    public void createAccount() {
       //get user input of full name
       do{
          System.out.println("Please enter your full name.");
          while(!sc.hasNext()){
          //checks for valid input
            System.out.println("That isn't a valid name");
            sc.next();
          }
          name = sc.nextLine();
       }while(name.length() > 1);
       
       //get user input of CC information
       do{
          System.out.println("Please enter your CC Information.");
          while(!sc.hasNext()){
          //checks for valid input
            System.out.println("That isn't a valid credit card number.");
            sc.next();
          }
          CC = sc.nextLine();
       }while(CC.length() > 1);
       
       //get user input of email
       do{
          System.out.println("Please enter your email.");
          while(!sc.hasNext()){
          //checks for valid input
            System.out.println("That isn't a valid email.");
            sc.next();
          }
          email = sc.nextLine();
       }while(email.length() > 1);
       
       //get user input of home address
       do{
          System.out.println("Please enter your home address.");
          while(!sc.hasNext()){
          //checks for valid input
            System.out.println("That isn't a valid home address.");
            sc.next();
          }
          address = sc.nextLine();
       }while(address.length() > 1);
      
       System.out.println("Thank you. All information to create your account has been received.");
    }

}
