import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Plant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plant extends Actor implements invoker, Subject  
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class invoke
     */
    private ArrayList<Observer> obs = new ArrayList<Observer>();
    private Command c;
    public int a;
    
    public Plant(int a){
        this.a = a;
        
    }
    public void addObserver(Observer o){
        obs.add(o);
    }
    
    public void notifyObservers()
    {
        for (Observer obj: obs){
            obj.update(a);
        }
    }
        
    public void setCommand(Command c)
    {
        this.c = c;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void invoke(){
        
        if(a != 0 ){
        if(c.execute(2))
        {
        a = a-1;
        notifyObservers();
    }
}
    }
}