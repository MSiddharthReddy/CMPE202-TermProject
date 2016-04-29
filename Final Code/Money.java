/**
 * Write a description of class PackageNo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
import java.awt.Color;
 
public class Money extends Actor implements Observer
{
    
    private Subject2 s;
     private Subject2 s2;
      private Subject2 s3;
    private int no;
    public Money(Subject2 s, Subject2 s2,Subject2 s3,int n)
    {
        this.s = s;
        this.s2 = s2;
        this.s3 = s3;
        s.addObserver(this);
        s2.addObserver(this);
        s3.addObserver(this);
        //no = n;
        no = 20;
        setText(no);
    }
    
    public void update(int a)
    {
        
        no = no - a;
        setText(no);
    
    }    
    
    public void setText(int text)
    {
        setImage(new GreenfootImage(""+text, 24, Color.black, new Color(0, 0, 0, 0)));
        
    } 
}
