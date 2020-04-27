package RegionalControlComputer;
import java.util.Scanner;

public class RCCTester {
    //main method
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);      
      String cardType;
      String nameOnCard;
      int expMonth;
      int expDay;
      String cardNo;
      String cardStatus;
      

        System.out.print("Debit or Credit Card? ");
        cardType = scanner.nextLine();
        System.out.print("Name on Card: ");
        nameOnCard = scanner.nextLine();
        System.out.print("Expiration Month of Card: ");
        expMonth = scanner.nextInt();
        System.out.print("Expiration Day of Card: ");
        expDay = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Card Number: ");
        cardNo = scanner.nextLine();
        System.out.print("Getting charged on Checking or Savings? ");
        scanner.nextLine();
        if(cardType == "Credit") {
            //card.authorizeDebitCardPayment(cardNo);
            System.out.println("Set as Credit");
        }
        else if(cardType == "Debit"){
            //card.authorizeCreditCardPayment(cardNo);
             System.out.println("Set as Debit");
        }
        else{
            System.out.println("Credit Card not approved");
        }
    }

}
