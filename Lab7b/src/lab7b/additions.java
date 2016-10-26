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
public class additions {

		if(currentCell == 5 && advance == true)
		{
			//.	.	.
		}
 
		if(currentCell == 6 && advance == true)
		{
			//
		}

		if(currentCell == 9 && advance == true)
		{
			//.	.	.
		}
    
                    if(currentCell == 5 && advance == true)
	{
	if (myMove == 'W')
	    {
	    advance = false;
	    System.out.println("SORRY, there is no return");
	    return advance;
	    }
	if (myMove == 'A')
            {
	    advance = false;
	    System.out.println("SORRY, there is no return");
	    return advance;
	    }
	if (myMove == 'D')
	    {
	    currentCell = 6;
            advance = true;
	    System.out.println("continue through the maze");
	    return advance;
	    }
	if (myMove == 'S')
	    {
	    advance = false;
	    System.out.println("try again");
	    return advance;
	    }
    if(currentCell == 6 && advance == true)
	{
	if (myMove == 'W')
            {
            advance = false;
            System.out.println("SORRY, there is no return");
            return advance;
            }
	if (myMove == 'A')
            {
            advance = false;
            System.out.println("SORRY, there is no return");
            return advance;
            }
	if (myMove == 'D')
            {
            advance = false;
            System.out.println("Try again");
            return advance;
            }
	if (myMove == 'S')
            {
            currentCell = 9;
            advance = true;
            System.out.println("continue through the maze");
            return advance;
            }
    if(currentCell == 9 && advance == true)
	{
	if (myMove == 'W')
            {
            advance = false;
            System.out.println("SORRY, there is no return");
            return advance;
            }
	if (myMove == 'A')
            {
            advance = false;
            System.out.println("SORRY, there is no return");
            return advance;
            }
	if (myMove == 'D')
            {
            advance = false;
            System.out.println("Try again!");
            return advance;
            }
	if (myMove == 'S')
            {
            currentCell = 9;
            advance = true;
            System.out.println("Youm have found the exit");
            return advance;
            }
}
