/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7b;

/**
 *
 * @author colby
 */
 */

import static lab7b.Maze.currentCell;

public class DisplayMenu {
    public void getMenu()
    {
	if(currentCell == 0)
	{
		System.out.println("You have entered the maze!!");
		System.out.println("There is no turning back!!");
		currentCell = 1;
		mazeStatus();
		advance = true;
	}
      System.out.println("make your move (W, A, S, D)");
      System.out.println("W = up, A = left, S = down, D = right)");
}// end method
}