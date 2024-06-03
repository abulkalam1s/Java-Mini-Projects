package ATM_Machine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMOperationImp implements ATMOperationInterface {
    Scanner input = new Scanner(System.in);
    ATM atm = new ATM();
    Map<Double, String> mini_stat = new HashMap<>(); // ******
    @Override
    public void viewBalance() {
        System.out.println("Available balance is: "+atm.getBalance());
        System.out.println();
    }

    @Override
    public void depositAmount(double amount) {
        mini_stat.put(amount, " Amount deposited.");
        atm.setBalance(atm.getBalance() + amount);
        System.out.println("Amount "+amount+" is successfully deposited.");
        viewBalance();
    }

    @Override
    public void withdrawAmount(double amount) {
        if(amount <= atm.getBalance()) {
            mini_stat.put(amount, " Amount Withdrawn.");
            atm.setBalance(atm.getBalance()-amount);
            System.out.println("Amount: "+amount+ "is withdrawn successfully.");
            viewBalance();
        } else {
            System.out.println("Insufficient Amount");
        }
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m:mini_stat.entrySet()) {
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
    
}
