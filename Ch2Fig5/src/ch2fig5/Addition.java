/*
 *Example code From Ch. 2 of the Deitel book
 */
package ch2fig5;

/**
 *Fig. 2.7: Addition.java
 * Addition program that displays the sum of two numbers.
 * @author colby
 */
import java.util.Scanner;
public class Addition {
//Main method begind execution
    public static void main(String[] args) {
        //Create a scanner to obtain input from the program window
        Scanner input = new Scanner(System.in);
        
        int number1; //first number to add
        int number2; //second number to add
        int sum; //sum of number1 and number2
        
        System.out.print("Enter the first integer: "); //prompt
        number1 = input.nextInt(); //read first number from user
        
        System.out.print("Enter the second integer: "); //prompt
        number2 = input.nextInt(); //read second number from user
        
        sum = number1 + number2; //add the numbers and then store the total in sum
        
        System.out.printf("Sum is %d\n" , sum);

    }//end method mail
    
}//end class addition
