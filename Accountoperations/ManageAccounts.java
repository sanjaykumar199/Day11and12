package Com.bridgelabz.day11and12.Accountoperations;
import java.util.*;
public class ManageAccounts {
    private static double currentBalance = 1234567.980;
    Scanner sc = new Scanner(System.in);

    public static double getCurrentbalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        ManageAccount.currentBalance = currentBalance;
    }

    public void showBalance() {
        System.out.println("Current balance: " + currentBalance);
    }

    public void addBalance() {
        System.out.println("\nPlease Enter the Amount to add");
        double addAmount = sc.nextDouble();
        currentBalance = currentBalance + addAmount;
        System.out.println("Amount Added Sucessfully");
        System.out.println("\nPress 1 to view account Balance");
        int acc = sc.nextInt();
        if (acc == 1) {
            System.out.println("Your account balance is " + currentBalance);
        }
    }

    public void withDrawBalance() {
        System.out.println("Enter the amount to be withdrawn");
        double withDrawAmount = sc.nextDouble();
        if (withDrawAmount <= 0) {
            System.out.println("Please Enter Valid Amount");
        } else if (withDrawAmount > currentBalance) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Please wait ");
            System.out.println(".......");
            System.out.println("Balance withdraw sucessfully");
            currentBalance = currentBalance - withDrawAmount;
            System.out.println("\nAvailable Balance is " + currentBalance);
        }
    }


}