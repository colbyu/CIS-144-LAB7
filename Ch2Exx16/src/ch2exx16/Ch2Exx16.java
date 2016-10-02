/*
2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains
them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
(Page 67). 
 */
package ch2exx16;

/**
 *
 * @author colby
 */
import java.util.Scanner;
public class Ch2Exx16 {

    public static void main(String[] args) {
        // create scanner to obtain input from the command line
        Scanner input = new Scanner(System.in);
        
        int number1;//the first number to compare
        int number2;//the second number to compare
        
        System.out.println("enter first integer");//prompt
        number1 = input.nextInt(); //read first number from input
        
        System.out.println("enter second integer");//prompt
        number2 = input.nextInt(); //read second number from input
        
        if(number1 == number2)
            System.out.println("These numbers are equal");
        
        if(number1 > number2)
            System.out.printf("%d Is larger than %d\n", number1, number2);
        
        if(number1 < number2)
            System.out.printf("%d Is larger than %d\n", number2, number1);
    }
    
}
