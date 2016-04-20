import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor implements Vehicle
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int pack = 0;
     public void assign(){
        
        if(pack != 2)
        {
        pack += pack;
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
