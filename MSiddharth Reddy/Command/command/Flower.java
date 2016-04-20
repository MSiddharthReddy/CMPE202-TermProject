import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor implements Command
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Vehicle v;
    public Flower (Vehicle v){
        
        this.v = v;
    }
    
    public void execute() 
    {
        // Add your action code here.
        v.assign();
    }    
    public void act() 
    {
        // Add your action code here.
    }    
    
    
}
