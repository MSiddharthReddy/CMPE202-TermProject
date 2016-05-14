/**
 * Write a description of class PackageNo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
import java.awt.Color;
import java.util.ArrayList;
 
public class TreeText extends Actor implements Observer, Subject
{
    
    private Subject s;
    private int no;
      private ArrayList<Observer> obs = new ArrayList<Observer>();
    public TreeText(Subject s, int n)
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
        if (no == 0)
        {
            notifyObservers();
        }
    
    }    
    
    public void setText(int text)
    {
        setImage(new GreenfootImage(""+no, 24, Color.white, new Color(0, 0, 0, 0)));
    } 
    
    public int getBig() {
        return no;
    }
     public void addObserver(Observer o){
        obs.add(o);
    }
    
    public void notifyObservers()
    {
        for (Observer obj: obs){
            obj.update(no);
        }
    }
}
