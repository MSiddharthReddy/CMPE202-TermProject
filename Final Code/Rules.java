import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rules extends World
{

    /**
     * Constructor for objects of class Rules.
     * 
     */
    Rul r = new Rul();
    Back b = new Back();
    public Rules()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(r, 300 , 200);
        addObject(b, getWidth() - 100,getHeight() - 60);
    }
    public void act()
    {
           if(Greenfoot.mouseClicked(b))
      {
        
           Greenfoot.setWorld(new StartScreen());
            
       }
    }
}
