import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor implements invoker
{
    /**
     * Constructor for objects of class invoke
     */
    private Command c;
    public void setCommand(Command c){
        this.c = c;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void invoke(){
        c.execute(3);
    }
}