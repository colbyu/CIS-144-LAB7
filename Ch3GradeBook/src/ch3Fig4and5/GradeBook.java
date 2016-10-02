// Fig. 3.10: GradeBook.java
// GradeBook class that contains a courseName instance variable
// and methods to set and get its value.
package ch3Fig4and5;
public class GradeBook
{
    private String courseName;//Course Name for this GradeBook
    
    //constructor initializes coursename wiyh String argument
    public GradeBook(String name)
    {
        courseName = name; //initializes coursename
    }//end constructor
    
    //method to set the course name
    public void setCourseName(String name)
    {
        courseName = name;//store the course name
    }//end method setCourseName
    
    //method to retrieve the course name
    public String getCourseName()
    {
        return courseName;
    }//end method getcoursename

    // display a welcome message to the GradeBook user
    public void displayMessage()
    {
         //calls getCourseName to get the name of
         //the course this GradeBook represents
         System.out.printf( "Welcome to the grade book for\n%s!\n",
             getCourseName());
         } // end method displayMessage
     } // end class GradeBook
