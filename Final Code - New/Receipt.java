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
    public static final int ITEM_DISTANCE = 1;
    public static final int TOTAL_ADD_DISTANCE = 7;    
    List<ReceiptComponent> itemList;
    
    public Receipt() {
        GreenfootImage i = getImage();
        i.scale(600, 400);
        setImage(i);
        itemList = new LinkedList<ReceiptComponent>();     
        ReceiptComponent concreteCaculatorComponent = new ConcreteCalculatorComponent();
        itemList.add(concreteCaculatorComponent);
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
        int cX = receiptImage.getWidth()/3;
        int cY = receiptImage.getHeight()/7;
        int i = 0;
        for (ReceiptComponent c : itemList) {
            c.draw();
            i++;
            receiptImage.drawImage((GreenfootImage) c, cX, cY);
            cY += ((GreenfootImage) c).getHeight() + ITEM_DISTANCE;
            if (i == itemList.size()-1) {
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
    
    public ReceiptComponent getLastItem() {
        return ((LinkedList<ReceiptComponent>) itemList).getLast();
    }
    
    
}
