import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.*;

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor implements TimerSubject
{
    ArrayList<Observer> observers = new ArrayList<Observer>();
    static int totalTime = 0;
    Date startTime;
    Date currentTime;
    int difference = 0;
    int newdiff = 0;
    Receipt receipt;
    //Money m = new Money();
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Timer(int totalTime)
    {
        this.totalTime = totalTime;
        startTime = Calendar.getInstance().getTime();
        draw(totalTime);
        
        
    }
    
    public void act() 
    {
        // Add your action code here.
        currentTime = Calendar.getInstance().getTime();
        difference = (int)(currentTime.getTime() - startTime.getTime())/(1000);
        if(difference != newdiff) {
            //System.out.println("" + difference );
            newdiff = difference;
            if(--totalTime >= 0){
                draw(totalTime);
                notifyObservers(totalTime);
            }
        }
    }
    
        public void setReceipt(Receipt r) {
        receipt = r;
    }
    
    public void draw(int time)
    {
        GreenfootImage newImage = new GreenfootImage(200,50);
        newImage.clear();
        
        newImage.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        newImage.setColor(new Color(127, 127, 127, 127));
        newImage.fill();
        
        newImage.setColor(Color.white);
        newImage.drawString("Time Left: " + time, 20, 35);
        setImage(newImage);
        
        if(time == 0){
           
            //World world = getWorld();
             //world.removeObjects(world.getObjects(null));
           // world.addObject(new GameOverScreen(), world.getWidth()/2, world.getHeight()/2);
           //  Greenfoot.stop();
            int totalCost = ((CaculatorComponent)receipt.getLastItem()).caculCost();
        int totalTime = ((CaculatorComponent)receipt.getLastItem()).caculTime();
        
        ReceiptComponent receiptTotal = new ReceiptTotal(totalCost, totalTime);
        
        receipt.addItem(receiptTotal);
        
        getWorld().addObject(receipt, getWorld().getWidth()/2, getWorld().getHeight()/2);
      
        receipt.draw();
        
        if ((((CarWorld) getWorld()).getMoney() >= totalCost) && (((TreeText) ((CarWorld) getWorld()).getTreeText()).getBig() == 0)  && (((FlowerText) ((CarWorld) getWorld()).getFlowerText()).getSmall() == 0) && (((PlantText) ((CarWorld) getWorld()).getPlantText()).getMedium() == 0 )) {
         if((((Car) ((CarWorld) getWorld()).getCar()).getState() == ((Car) ((CarWorld) getWorld()).getCar()).getEmpty() )  && (((Boat) ((CarWorld) getWorld()).getBoat()).getState() == ((Boat) ((CarWorld) getWorld()).getBoat()).getEmpty() ) && (((Rocket) ((CarWorld) getWorld()).getRocket()).getState() == ((Rocket) ((CarWorld) getWorld()).getRocket()).getEmpty() ) ){
         
            getWorld().addObject(new Won(), getWorld().getWidth()/2 + 100, getWorld().getHeight()/2 + 100);
        }
         else{
            getWorld().addObject(new GameOverScreen(), getWorld().getWidth()/2 + 100, getWorld().getHeight()/2 + 100);
        }
    }
        else{
            getWorld().addObject(new GameOverScreen(), getWorld().getWidth()/2 + 100, getWorld().getHeight()/2 + 100);
        }
        
        Greenfoot.stop();
        }
        
   }
    
    public void attach(Observer obj){
        observers.add(obj);
    }
    public void detach(Observer obj){
        observers.remove(obj);
    }
    public void notifyObservers(int time){
        for(Observer obj : observers){
            obj.update(time);
        }
    }
}
