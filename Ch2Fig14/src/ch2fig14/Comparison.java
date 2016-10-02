/*
Sample code from Ch. 2 of the Dietel book
 */
package ch2fig14;

 /* Fig. 2.15: Comparison.java
 Compare integers using if statements, relational operators
 and equality operators.
 @author colby
 */
import java.util.Scanner;
public class Comparison {
//main method begins execution
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
            System.out.printf("%d == %d\n", number1, number2);
        
        if(number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        
        if(number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        
        if(number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }//end method main
    
}//end class comparison
