/*
2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print
Assume that the user enters the correct number of digits. What happens when you execute the
program and type a number with more than five digits? What happens when you execute the program and type a number with fewer than five digits? [Hint: It’s possible to do this exercise with the
techniques you learned in this chapter. You’ll need to use both division and remainder operations
to “pick off” each digit.]
(Page 69). 
 */
package ch2ex30;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class Ch2ex30 {

    public static void main(String[] args) {
        int number = 0;
        int dig1, rem1 = 0;
        int dig2, rem2 = 0;
        int dig3, rem3 = 0;
        int dig4, rem4 = 0;
        int dig5, rem5 = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a five digit number");
        number = input.nextInt();
         dig1 = number / 10000;
         rem1 = number % 10000;
         dig2 = rem1 / 1000;
         rem2 = rem1 % 1000;
         dig3 = rem2 / 100;
         rem3 = rem2 % 100;
         dig4 = rem3 / 10;
         rem4 = rem3 % 10;

         System.out.println(dig1 + " " + dig2 + " " + dig3 + " " + dig4 + " " + rem4);

    
}
