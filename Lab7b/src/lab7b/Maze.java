
package lab7b;
/**
 *
 * @author colby
 */
import java.util.Scanner;
 //Colby Underhill, Programmer
 public class Maze 
    {
    static DisplayMenu menu = new DisplayMenu();
    static Scanner sc = new Scanner(System.in);
    static MazeStatus status = new MazeStatus();
    static Moves moves = new Moves();
    static DisplayMovement move = new DisplayMovement();
    static MakeYourMove yourMove = new MakeYourMove();
    static ChecckYourMove checkMove = new ChecckYourMove();
    static char myMove = '\0';
    static boolean checkThis = false;
    public static void main(String args[])
        {
        char answer = 'Y';
        menu.getMenu();
        while(answer == 'Y' || answer == 'y') 
            {
            move.getMovement();
            yourMove.getYourMove();
            checkThis = checkMove.getMove();
            status.status();
            System.out.println("move again(Y or N)?");
            answer = sc.next().charAt(0);
            }
        System.out.println("***************************");
        }// end main() method
 }