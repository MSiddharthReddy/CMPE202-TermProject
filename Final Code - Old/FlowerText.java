/**
 * Write a description of class PackageNo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
import java.awt.Color;
 
public class FlowerText extends Actor implements Observer
{
    
    private Subject s;
    private int no;
    public FlowerText(Subject s, int n)
    {
        this.s = s;
        s.addObserver(this);
        no = n;
        setText(no);
    }
    
    public void update(int a)
    {
        
        no = a;
        setText(no);
    
    }    
    
    public void setText(int text)
    {
        setImage(new GreenfootImage(""+text, 24, Color.black, new Color(0, 0, 0, 0)));
    } 
}
