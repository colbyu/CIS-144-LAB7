/*
2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.
(Page 69). 
 */
package ch2ex32;

/**
 *
 * @author colby
 */
import java.util.Scanner;
public class Ch2Ex32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set up our variables to hold numbers
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        //variables to hold counts
        int pos1 = 0, pos2 = 0, pos3 = 0, pos4 = 0, pos5 = 0;
        int zer1 = 0, zer2 = 0, zer3 = 0, zer4 = 0, zer5 = 0;
        int neg1 = 0, neg2 = 0, neg3 = 0, neg4 = 0, neg5 = 0;
        //variables to hold final counts
        int numpos = 0, numneg = 0, numz = 0;
        Scanner input = new Scanner(System.in);
        //ask for input
        System.out.println("Please enter a positive or negative number");
        num1 = input.nextInt();
        System.out.println("Please enter another positive or negative number");
        num2 = input.nextInt();
        System.out.println("Please enter another positive or negative number");
        num3 = input.nextInt();
        System.out.println("Please enter another positive or negative number");
        num4 = input.nextInt();
        System.out.println("Please enter another positive or negative number");
        num5 = input.nextInt();
        //assess numbers and assign 1 to variable that is true for each number
        if(num1 > 0)
            pos1 = 1;
        if(num1==0)
            zer1 = 1;
        if(num1<0)
            neg1 = 1;
        if(num2 > 0)
            pos2 = 1;
        if(num2==0)
            zer2 = 1;
        if(num2<0)
            neg2 = 1;
        if(num3 > 0)
            pos3 = 1;
        if(num3==0)
            zer3 = 1;
        if(num3<0)
            neg3 = 1;
        if(num4 > 0)
            pos4 = 1;
        if(num4==0)
            zer4 = 1;
        if(num4<0)
            neg4 = 1;
        if(num5 > 0)
            pos5 = 1;
        if(num5==0)
            zer5 = 1;
        if(num5<0)
            neg5 = 1;
        //add up the counters
        numpos = (pos1 + pos2 + pos3 + pos4 + pos5);
        numneg = (neg1 + neg2 + neg3 + neg4 + neg5);
        numz = (zer1 + zer2 + zer3 + zer3 + zer5);
        //display the results
        System.out.println("You input:");
        System.out.println(numpos + " positive integers, ");
        System.out.println(numneg + " negative integers, ");
        System.out.println(numz + " zeros.");     
    }
}