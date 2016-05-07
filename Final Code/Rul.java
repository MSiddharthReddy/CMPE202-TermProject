import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Rul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rul extends Actor
{
    /**
     * Act - do whatever the Rul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String text = "1. The Goal of the game is to deliver all the packages to the\n destination before the time ends.\n2. The user has $9 as budget to do it.\n3. Each trip of an ambulance costs $3.\n4. Each Trip of a Car Costs $2.\n5. Each Trip of a Rocke costs $1.\n6. The Ambulance can carry all the three types of packages.\n7. The Car can carry Plant and Flower.\n8. The Rocket can only carry Flower.\n9. Each vehicle can carry a max of items at for a trip and can also be started empty.\n10. The time taken by the vehicles depends on the no of packages its\ncarrying 6, 12 & 18 sec for 0, 1 & 2 packages.\n11. Winning or loosing the game depends on how quickly you think and assign the packages\n to the correct vehicles.\nGood Luck and Press the Go back to Get back to the Start.";
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage( text,15, Color.white, new Color(0, 0, 0, 0)));
        
    }    
}
