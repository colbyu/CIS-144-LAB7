// Fig. 3.8: GradeBookTest.java
// Creating and manipulating a GradeBook object.
package ch3Fig4and5;
import java.util.Scanner; // program uses Scanner
public class GradeBookTest
{
    // main method begins program execution
    public static void main( String[] args )
    {
        // create GradeBook object
        GradeBook gradeBook1 = new GradeBook(
            "CIS144 Introduction to Java Programming");
        GradeBook gradeBook2 = new GradeBook(
            "CIS244 Advanced Java Programming");

        // display the initial value of courseName
        System.out.printf( "gradeBook1 course name is: %s\n",
            gradeBook1.getCourseName() );
        System.out.printf( "gradeBook2 course name is: %s\n",
            gradeBook2.getCourseName() );
}       // end main
} // end class GradeBookTest
