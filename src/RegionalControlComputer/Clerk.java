import java.util.Scanner;

package RegionalControlComputer;

public class Clerk implements Account {
    Scanner sc = new Scanner(System.in);
    
    //initialize UID to 0 (default)
    int UID = 0;

    //take in user input to create the UID  
    public void createAccount() {
      System.out.println("Please enter the UID for this new account: ");
      UID = sc.nextInt();
    }
    
    //take in user input for UID and validate
    public void login(int ID) {
      System.out.println("Please enter your UID to login: " );
      ID = sc.nextInt();
      checkCredentials(ID);
    }
    
    //validates if the UID entered matches the one created
    public void checkCredentials(int ID) {
      //does ID entered return the UID that was created
      if(ID == UID) { 
         System.out.println("Successfully verified and logged in");
      } else if(ID != UID) {
         System.out.println("Login attempt failed");
      }
    }
    
    //update the account
    public void updateAccount() {
      System.out.println("Update the account?");
      String response = sc.nextLine();
      if(response.equals("y")){
         System.out.println("Account updated");
      } if(response.equals("n")){
         System.out.println("Account not updated");
      } else {
         System.out.println("Invalid choice");
      }

    }
    
    //deletes an account
    public void deleteAccount(String response) {
      System.out.println("Would you like to delete the account? y/n");
      response = sc.nextLine();
      if(response.equals("y")){
         System.out.println("Account deleted");
      } if(response.equals("n")){
         System.out.println("Canceled");
      } else {
         System.out.println("Invalid choice");
      }
   }
    
    //waives the late charge
    public void waiveLateCharge(String response) {
      System.out.println("Would you like to waive the late charge? y/n");
      if(response.equals("y")){
         System.out.println("Late charge waived");
      } if(response.equals("n")){
         System.out.println("Late charge applied");
      } else {
         System.out.println("Invalid choice");
      }
    
    }
    
    //create report 
    public void createReport(String reportType) {
      System.out.println("Please choose a report type: type 'inventory' or 'customer'");
      reportType = sc.nextLine();
      
    }
     
}
