import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Receipt receipt;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        receipt = new Receipt();
        addObject(receipt, getWidth()/2, getHeight()/2);
        
        ReceiptComponent l1 = new Leaf();
        ReceiptComponent l2 = new Leaf();
        ReceiptComponent l3 = new Leaf();
        receipt.addItem(l1);
        receipt.addItem(l2);
        receipt.addItem(l3);
        
        receipt.draw();
    }
}
