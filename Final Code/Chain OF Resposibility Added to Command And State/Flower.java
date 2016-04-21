import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor implements invoker
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class invoke
     */
    private Command c;
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
        
        c.execute(1);
    }
}