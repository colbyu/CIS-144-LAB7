package lab7b;

/**
 *
 * @author colby
 */
public class MazeStatus 
    {
    static DisplayMovement movement = new DisplayMovement();
    public void status()
         {
	System.out.println("current position: cell " + movement.getCurrentCell());
        }//end method
    }
