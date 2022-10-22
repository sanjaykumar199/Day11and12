package Com.bridgelabz.day11and12.Accountoperations;
import java.util.*;
public class AccountOperations{
    public static void main(String[] args) {
            while(true)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter What operation to be performed: ");
                System.out.println("Press 1: View Current Balance.");
                System.out.println("Press 2: Deposite Money.");
                System.out.println("Press 3: Withdraw Money.");

               ManageAccount manageAccount = new ManageAccount();

                int operation = sc.nextInt();

                switch(operation)
                {
                    case 1:
                        manageAccount.showBalance();
                        break;
                    case 2:
                        manageAccount.addBalance();
                        break;
                    case 3:
                        manageAccount.withDrawBalance();
                        break;
                    default:
                        System.out.println("Invalid Choice");


                }
            }

        }

    }