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
    
    public void draw(int time)
    {
        GreenfootImage newImage = new GreenfootImage(200,50);
        newImage.clear();
        
        newImage.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        newImage.setColor(new Color(127, 127, 127, 127));
        newImage.fill();
        
        newImage.setColor(Color.black);
        newImage.drawString("Time Left: " + time, 20, 35);
        setImage(newImage);
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
