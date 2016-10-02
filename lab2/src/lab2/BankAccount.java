/*
 * Program for BankAccount data including deposits and withdrawals.
 * Running balance is kept along the way and displayed at program end
 */
package lab2;
import java.util.Scanner;
/**
 * @author Colby Underhill
 */
public class BankAccount {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // programs local variables
    int acctNum = 0;
    double acctBal = 0.0, currency = 0.0;
    double checks = 0.0, coins = 0.0;
    //double newBal = 0.0; 
    double withdraw = 0.0;
    Scanner sc = new Scanner(System.in);
    // the program header
    System.out.println("<< Bank Account >>");
    System.out.println("------------------");
    System.out.println(" ");
    // prompt user for data and receive data
    System.out.println("please enter your account number");
    acctNum = sc.nextInt();
    System.out.println("your account number " + acctNum);
    System.out.println("please enter your account balance");
    acctBal = sc.nextDouble();
    System.out.printf("**account balance %6.2f\n" , acctBal);
    System.out.println("please enter the cash deposit amount");
    currency = sc.nextDouble();
    System.out.printf("**deposit amount (cash) $%6.2f\n" ,currency);
    System.out.println("please enter the check deposit amount");
    checks = sc.nextDouble();
    System.out.printf("**deposit amount (checks) $%6.2f\n" ,checks);
    System.out.println("please enter the coins deposit amount");
    coins = sc.nextDouble();
    System.out.printf("**deposit amount (coins) $%6.2f\n" ,coins);
    double newBal = (acctBal + currency + checks + coins);
    System.out.println("Your new account balance for account " + acctNum + "is: ");
    System.out.printf("$%6.2f\n" ,newBal);
    System.out.println("please enter the withdrawal amount");
    withdraw = sc.nextDouble();
    System.out.printf("**withdrawal amount (cash) $%6.2f\n" ,withdraw);
    if (newBal < withdraw){
        System.out.println("Withdrawl failed. Amount too large.");
        System.out.printf("you only have $%6.2f" ,newBal);
        System.out.println(" available to withdraw.");
    }
    else {
        System.out.println("Your final account balance for account " + acctNum + "is: ");
    System.out.printf("$%6.2f\n" ,newBal - withdraw);
    // the program footer
    System.out.println(" ");
    System.out.println("thank you!");
    System.out.println("------------------");
    }
}
