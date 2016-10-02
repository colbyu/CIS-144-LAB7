/*
2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in table format, as shown below. [Note: This program does not require
any input from the user.]
(Page 69). 
 */
package ch2ex31;

/**
 *
 * @author colby
 */
public class Ch2Ex31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double num = 0, square = 0, cube = 0;

System.out.println("number   square   cube");
System.out.println(num  + "      " + square  + "      "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "      "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "      "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "      "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "     "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "     "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "     "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "     "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "     "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "      " + square  + "     "+ cube);
num++;
square = Math.pow(num, 2);
cube = Math.pow(num, 3);
System.out.println(num  + "     " + square  + "    "+ cube);

    }
    
}
