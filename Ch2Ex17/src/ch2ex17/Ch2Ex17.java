/*
2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig.  2.15.  [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]
(Page 67). 
 */
package ch2ex17;

/**
 *
 * @author colby
 */
import java.util.Scanner;
public class Ch2Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to obtain input from the command line
        Scanner input = new Scanner(System.in);
        
        int number1;//the first number to compare
        int number2;//the second number to compare
        int number3;//the third number to compare
        
        int average; //the average of the numbers
        int sum; //the sum of the three numbers
        int prod; //the product of the three numbers
        int smallest; //the smallest of the numbers
        int largest; // the largest of the numbers

        System.out.println("enter first integer");//prompt
        number1 = input.nextInt(); //read first number from input
        
        System.out.println("enter second integer");//prompt
        number2 = input.nextInt(); //read second number from input
        
        System.out.println("enter third integer");//prompt
        number3 = input.nextInt(); //read third number from input
        
        sum = (number1 + number2 + number3);
        average = sum / 3;
        prod = number1 * number2 * number3;
        System.out.println("The sum of " + number1 + ", " + number2 + ", and " + number3 + " is: " + sum);
        System.out.println("The product of " + number1 + ", " + number2 + ", and " + number3 + " is: " + prod);
        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);
        //find larger number
        largest = number1;
        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        System.out.println("The largest one is> " + largest);
        //find larger number
        smallest = number1;
        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
        System.out.println("Yhe smallest one is> " + smallest);
        
        
    }
    
}
