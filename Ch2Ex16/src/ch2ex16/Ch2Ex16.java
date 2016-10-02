/*
2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them
from the user and prints their sum, product, difference and quotient (division). Use the techniques
shown in Fig. 2.7
 */
package ch2ex16;

import java.util.Scanner;

/**
 *
 * @author colby
 */
public class Ch2Ex16 {
//Main method begins execution
    public static void main(String[] args) {
        //Create a scanner to obtain input from the program window
        Scanner input = new Scanner(System.in);
        
        int number1; //first number to add
        int number2; //second number to add
        int sum; //sum of number1 and number2
        int prod;
        int dif;
        int quo; 
        System.out.print("Enter the first integer: "); //prompt
        number1 = input.nextInt(); //read first number from user
        
        System.out.print("Enter the second integer: "); //prompt
        number2 = input.nextInt(); //read second number from user
        
        sum = number1 + number2; //add the numbers and then store the total in sum
        prod = number1 * number2; //multiply the numbers and then store the total in prod
        dif = number1 - number2; //subtract the numbers and then store the total in dif
        quo = number1 / number2; //divide the numbers and then store the total in quo
        
        System.out.printf("Sum is %d\n" , sum);
        System.out.printf("Product is %d\n" , prod);
        System.out.printf("Differance is %d\n" , dif);
        System.out.printf("Quotiant is %d\n" , quo);

    }//end method mail
    
}//end class addition
