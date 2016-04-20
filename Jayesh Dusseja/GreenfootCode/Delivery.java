import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Delivery here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delivery extends World
{
    BigCar bc = new BigCar();
    MediumCar mc = new MediumCar();
    SmallCar sc = new SmallCar();
    Home hm = new Home();
    /**
     * Constructor for objects of class Delivery.
     * 
     */
    public Delivery()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(bc, 100, 100);
        addObject(mc, 100, 200);
        addObject(sc, 100, 300);
        addObject(hm, 500, 200);
    }
}
