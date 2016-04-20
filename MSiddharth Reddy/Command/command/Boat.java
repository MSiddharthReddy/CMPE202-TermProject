import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat extends Actor implements Vehicle
{
    /**
     * Act - do whatever the Boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int pack = 0;
    public void assign(){
        
        if(pack != 2)
        {
        pack = pack + 1;
        
        System.out.println(pack);
    }
    else
    {
      //next.assign();
    }
   }
   
   public void run(){}
   public void change(){
       
       pack = 0;
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
