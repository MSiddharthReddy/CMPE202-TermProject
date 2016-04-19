import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class ReceiptToal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiptTotal extends Leaf 
{
    private int totalCost;
    private int totalTime;
    
    public ReceiptTotal(int cost, int time) {
        totalCost = cost;
        totalTime = time;
    }
    
    public void draw() {
             clear();
           Color c = new Color(255, 255, 255);
           setColor(c);
           Font f = new Font("Comic Sans MS", Font.PLAIN, 16);
           setFont(f);
           fill();
           setColor(Color.black);
           String presentString = "Total               $" + totalCost + "   " + totalTime + "s";
           drawString(presentString, 0, getHeight()/2);
    }
    
    public void addItem(ReceiptComponent component) {
        
    }
    
    public ReceiptComponent getItem(int i) {
        return null;
    }
}
