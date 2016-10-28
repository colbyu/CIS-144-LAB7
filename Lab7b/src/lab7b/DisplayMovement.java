package lab7b;


/**
 *
 * @author colby
 */
public class DisplayMovement 
    {
    static int score = 10;
    static int currentCell = 0;
    boolean advance = true;
    static MazeStatus status = new MazeStatus();
    public int getScore()
        {
        return score;
        }
    public void setScore(int points)
        {
        score = points;
        }
    public int getCurrentCell()
        {
        return currentCell;
        }
    
    public void setCurrentCell(int cell)
        {
        currentCell = cell;
        }
    public boolean getAdvance()
        {
        return advance;
        }
    
    public void setAdvance(boolean go)
        {
        advance = go;
        }
    public void getMovement()
        {
        if(currentCell == 0)
            {
            System.out.println("You have entered the maze!!");
            System.out.println("There is no turning back!!");
            System.out.println("You get " + getScore() +" points to start");
            System.out.println("Each mistake costs you a point");
            System.out.println("If you loose all of your pints you get teleported back to square 1" );
            System.out.println("with only half your starting points." );
            System.out.println("The objrctive is to end with as many points left as possible.");
            
            setCurrentCell(1);
            status.status();
            setAdvance(true);
            }
        System.out.println("make your move (W, A, S, D)");
        System.out.println("W = up, A = left, S = down, D = right)");
        }// end method displayMovement()
    }
