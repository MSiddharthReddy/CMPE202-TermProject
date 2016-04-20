import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWorld extends World
{

    /**
     * Constructor for objects of class CarWorld.
     * 
     */
    Boat b; 
    Car c;
    Rocket r;
    Tree t;
    Plant p;
    Flower f;
    invoker boat;
    public CarWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Boat b = new Boat();
        Car c = new Car();
        Rocket r = new Rocket();
        Tree t;
        Plant p;
        Flower f;
        invoker boat;
     
        
       t = new Tree(b);
       boat = new invoke(t);
        p = new Plant(b);
        boat = new invoke(p);
       f = new Flower(b);
       boat = new invoke(f);
     
       
        
        Destination d = new Destination();
        addObject(t, getWidth()/3,getHeight() - 50);
        addObject(p, getWidth()/2,getHeight() - 50);
       addObject(f, getWidth()/2 + 100,getHeight() - 50);
        addObject(b,50,getHeight()/3);
        addObject(c,50,getHeight()/2);
        addObject(d,getWidth() - 50,getHeight()/3);
        addObject(r,50,getHeight()/2 + 50);
        
    }
    
      public boolean mouseClicked(Flower f)
      {
        boat = new invoke(f);
        boat.execute();
            
       }
}
