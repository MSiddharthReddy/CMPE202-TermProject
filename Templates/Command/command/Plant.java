import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plant extends Actor implements Command
{
    /**
     * Act - do whatever the Plant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Vehicle v;
    public Plant (Vehicle v){
        
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
