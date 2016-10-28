package lab7b;

/**
 *
 * @author colby
 */
public class ChecckYourMove 
    {
    static DisplayMovement move = new DisplayMovement();
    static MakeYourMove yourMove = new MakeYourMove();
    static boolean advance=true;
    private static int score = 10;
    public boolean getMove()
        {// Advance on correct move, subtract points on wrong move.
        if(move.getCurrentCell() == 1 && advance == true)
            {
            if (yourMove.getMyMove() == 'W')
                {
		move.setAdvance(false);
                score -=1;
		System.out.println("Try again!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
		return advance;
		}
            if (yourMove.getMyMove() == 'A')
		{
		move.setAdvance(false);
                score -=1;
		System.out.println("SORRY, there is no return!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
		return advance;
		}
            if (yourMove.getMyMove() == 'D')
		{
		move.setCurrentCell(2);
		move.setAdvance(true);
		System.out.println("continue through the maze");
		return advance;
		}
            if (yourMove.getMyMove() == 'S')
		{
		move.setAdvance(false);
                score -=1;
		System.out.println("Try again!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
		return advance;
		}
            }
	if(move.getCurrentCell() == 2 && advance == true)
            {
            if (yourMove.getMyMove() == 'W')
		{
		move.setAdvance(false);
                score -=1;
		System.out.println("Try again!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
		return advance;
		}
            if (yourMove.getMyMove() == 'A')
		{
		move.setAdvance(false);
                score -=1;
		System.out.println("SORRY, there is no return!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
		return advance;
		}
            if (yourMove.getMyMove() == 'D')
		{
		move.setAdvance(false);
                score -=1;
		System.out.println("Try again!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
		return advance;
		}
            if (yourMove.getMyMove() == 'S')
		{
		move.setCurrentCell(5);;
		move.setAdvance(true);
		System.out.println("continue through the maze");
                return advance;
		}
            }
        if(move.getCurrentCell() == 5 && advance == true)
            {
            if (yourMove.getMyMove() == 'W')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("SORRY, there is no return!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            if (yourMove.getMyMove() == 'A')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("Try again!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            if (yourMove.getMyMove() == 'D')
                {
                move.setCurrentCell(6);
                move.setAdvance(true);
                System.out.println("continue through the maze");
                return advance;
                }
            if (yourMove.getMyMove() == 'S')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("Try again!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            }
        if(move.getCurrentCell() == 6 && advance == true)
            {
            if (yourMove.getMyMove() == 'W')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("SORRY, there is no return!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            if (yourMove.getMyMove() == 'A')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("SORRY, there is no return!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            if (yourMove.getMyMove() == 'D')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("Try again!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            if (yourMove.getMyMove() == 'S')
                {
                move.setCurrentCell(9);
                move.setAdvance(true);
                System.out.println("continue through the maze");
                return advance;
                }
            }
        if(move.getCurrentCell() == 9 && advance == true)
            {
            if (yourMove.getMyMove() == 'W')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("SORRY, there is no return!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            if (yourMove.getMyMove() == 'A')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("SORRY, there is no return!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            if (yourMove.getMyMove() == 'D')
                {
                move.setAdvance(false);
                score -=1;
                System.out.println("Try again!");
                System.out.println("Your mistake costs you 1 point,");
                System.out.println("you only have " + score + " points left.");
                return advance;
                }
            if (yourMove.getMyMove() == 'S')
                {
                move.setCurrentCell(9);
                move.setAdvance(true);
                System.out.println("You have found the exit");
                System.out.println("You win with " + score + " points remaining!");
                return advance;
                }
            }
        //If player makes too many mistakes, they get transported back to the start 
        // and get just 5 points to start with this time.
        if (score <= 0)
        {
        move.setCurrentCell(1);
        advance = true;
        System.out.println("You have lost all points");
        System.out.println("You have been transported back to square 1");
        System.out.println("You get 5 points to work with this time.");
        score = 5;
        return advance;
        }
	return advance;
        
	// end program menu
    }// end method checkYourMove()
        }   
    
