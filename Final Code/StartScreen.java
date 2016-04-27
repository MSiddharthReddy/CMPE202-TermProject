import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    StartSc s = new StartSc();
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
         addObject(s, getWidth()/2,getHeight() - 80);
         
        
        
    }
    public void act()
    {
           if(Greenfoot.mouseClicked(s))
      {
        
           Greenfoot.setWorld(new CarWorld());
            
       }
    }
}
