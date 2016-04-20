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
        addObject(bc, getWidth(), getHeight());
        MediumCab mc = new MediumCab();
        addObject(mc, getWidth(), getHeight());
        SmallCab sc = new SmallCab();
        addObject(sc, getWidth(), getHeight());
        BigPackage bp = new BigPackage();
        addObject(bp, getWidth(), getHeight());
        MediumPackage mp = new MediumPackage();
        addObject(mp, getWidth(), getHeight());
        SmallPackage sp = new SmallPackage();
        addObject(sp, getWidth(), getHeight());
        Home h = new Home();
        addObject(h, getWidth(), getHeight());
    }
    
}
