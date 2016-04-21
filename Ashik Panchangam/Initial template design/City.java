import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class City extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public City()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 765, 1); 
        BigCab bc = new BigCab();
        addObject(bc, 900, 390);
        MediumCab mc = new MediumCab();
        addObject(mc, 900, 470);
        SmallCab sc = new SmallCab();
        addObject(sc, 900, 570);
        BigPackage bp = new BigPackage();
        addObject(bp, 500, 725);
        MediumPackage mp = new MediumPackage();
        addObject(mp, 700, 725);
        SmallPackage sp = new SmallPackage();
        addObject(sp, 900, 725);
        Home h = new Home();
        addObject(h, 100, 290);
    }
    
}
