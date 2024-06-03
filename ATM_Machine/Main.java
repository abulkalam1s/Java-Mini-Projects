package ATM_Machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ATM_NUMBER = 12345;
        int ATM_PIN = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter the ATM number: ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter the ATM pin: ");
        int atmPin = sc.nextInt();
        System.out.println();

        ATMOperationImp imp = new ATMOperationImp();


        if(atmNumber == ATM_NUMBER && atmPin == ATM_PIN) {
            // System.out.println("Validation done.");
            try {
                while (true) {
                    Thread.sleep(2000);
                    System.out.println("1.View Available balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View mini-statement\n5.Exit");
                    System.out.println("Enter Choice : ");
                    int ch = sc.nextInt();
      
                    switch (ch) {
                      case 1:
                         imp.viewBalance();
                         break;
                      case 2: 
                          System.out.print("Enter the amount to be withdrew: ");
                          double amount = sc.nextDouble();
                          imp.withdrawAmount(amount);
                          break;   
                      case 3: 
                         System.out.print("Enter the amount to be deposited: ");
                         double depositAmt = sc.nextDouble();
                         imp.depositAmount(depositAmt);
      
                          break; 
                      case 4: 
                          imp.viewMiniStatement();
                          break;       
                      case 5: 
                            // 
                          System.out.println("Collect your ATM card.\n Thank you!");  
                          System.exit(0);
                          break;    
                      default:
                          System.out.println("Please enter the correct choice.");
                          break;
                    } 
                  }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        } else {
            System.out.println("Incorrect ATM number or pin.");
        }
    }
}
