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
    public static final int ITEM_POSITION_X = 10;
    public static final int ITEM_DISTANCE = 5;
    public static final int TOTAL_ADD_DISTANCE = 15;    
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
        int cX = ITEM_POSITION_X;
        int cY = receiptImage.getHeight()/4;
        int i = 0;
        for (ReceiptComponent c : itemList) {
            c.draw();
            i++;
            receiptImage.drawImage((GreenfootImage) c, cX, cY);
            cY += ((GreenfootImage) c).getHeight() + ITEM_DISTANCE;
            if (i == 3) {
                cY += TOTAL_ADD_DISTANCE;
            }
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
