import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Leaf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leaf extends GreenfootImage implements ReceiptComponent
{
    public static final int ITEM_WIDTH = 200;
    public static final int ITEM_HEIGHT = 30;    
    public Leaf() {
           super(ITEM_WIDTH, ITEM_HEIGHT);     
    }
    
    /**
     * Act - do whatever the Leaf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void draw() {
           clear();
           Color c = new Color(255, 255, 127);
           setColor(c);
           Font f = new Font("Comic Sans MS", Font.PLAIN, 10);
           setFont(f);
           fill();
           setColor(Color.blue);
           drawString(Integer.toString(100), getWidth()/2, getHeight()/2);
    }
    
    public void addItem(ReceiptComponent component) {
        
    }
    
    public ReceiptComponent getItem(int i) {
        return null;
    }
   
}
