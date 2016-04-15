import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends Actor implements ReceiptComponent
{
    List<ReceiptComponent> itemList;
    
    public Receipt() {
        itemList = new LinkedList<ReceiptComponent>();       
    }
    
    /**
     * Act - do whatever the Receipt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void draw() {
        GreenfootImage receiptImage = getImage();
        int cX = receiptImage.getWidth()/5;;
        int cY = receiptImage.getHeight()/5;
        for (ReceiptComponent c : itemList) {
            c.draw();
            
            receiptImage.drawImage((GreenfootImage) c, cX, cY);
            cY += ((GreenfootImage) c).getHeight() + 10;
        }
        setImage(receiptImage);
    }
    
    public void addItem(ReceiptComponent component) {
        itemList.add(component);
    }
    
    public ReceiptComponent getItem(int i) {
        return null;
    }
}
