package lab7b;

import java.util.Scanner;

/**
 *
 * @author colby
 */
public class MakeYourMove 
    {
    static Moves move = new Moves();
    static Scanner sc = new Scanner(System.in);
    static char myMove = '\0';
    public char getMyMove()
        {
        return myMove;
        }
        public void setMyMove(char move)
        {
        myMove = move;
        }
    public void getYourMove()
        {
	setMyMove(sc.next().charAt(0));
	switch(myMove)
            {
            case 'W': { move.MoveUp(); break; }
            case 'A': { move.MoveLeft(); break; }
            case 'S': { move.MoveDown(); break; }
            case 'D': { move.MoveRight(); break; }
            }
        }// end method makeYourMove()
    }
