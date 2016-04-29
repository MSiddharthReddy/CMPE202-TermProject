import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
import java.util.Random;
/**
 * Write a description of class CarWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWorld extends World
{

    /**
     * Constructor for objects of class CarWorld.
     * 
     */
    Receipt receipt = new Receipt();
    Random random = new Random();
   int i = random.nextInt(20);
   int pi = random.nextInt(2);
   int ti = random.nextInt(2);
   int fi = random.nextInt(2);
   Timer gameTime = new Timer(20);
    Boat b = new Boat(gameTime);
    Car c = new Car(gameTime);
    Rocket  r = new Rocket(gameTime);
    Command tb = new Assign(b);
    Command sb = new StartIn(b);
    Plant  p = new Plant(pi);
    Flower  f = new Flower(fi);
    Start s = new Start();
    Tree t = new Tree(ti);
    TreeText pt = new TreeText(t, ti);
    PlantText pp = new PlantText(p, pi);
    FlowerText pf = new FlowerText(f, fi);
    Money m = new Money(c, b ,r, i);
    
      
    public CarWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
       b.setSuccessor(c);
       c.setSuccessor(r);
        Destination d = new Destination();
        addObject(t, getWidth()/3,getHeight() - 50);
        addObject(p, getWidth()/2,getHeight() - 50);
       addObject(f, getWidth()/2 + 100,getHeight() - 50);
        addObject(b,50,getHeight()/3);
        addObject(c,50,getHeight()/2);
        addObject(d,getWidth() - 190,getHeight()/2);
        addObject(r,50,getHeight()/2 + 50);
        addObject(s,getWidth() - 100,getHeight()/3 + 220);
       addObject(pt, getWidth()/3,getHeight() - 100);
       addObject(pf, getWidth()/2 + 100,getHeight() - 100);
       addObject(pp, getWidth()/2,getHeight() - 100);
       addObject(m, 50,50);
       addObject(gameTime, 450, 30);
       c.setReceipt(receipt);
       r.setReceipt(receipt); 
       b.setReceipt(receipt);
       gameTime.setReceipt(receipt);
    }
    
    public void act()
    {
        
           if(Greenfoot.mouseClicked(f))
      {
        f.setCommand(tb);
        f.invoke();
            
       }
      else if(Greenfoot.mouseClicked(t))
      {
        t.setCommand(tb);  
        t.invoke();
            
       }
      else if(Greenfoot.mouseClicked(p))
      {
       
        p.setCommand(tb);  
        p.invoke();
            
       }
       else if(Greenfoot.mouseClicked(s))
      {
        s.setCommand(sb);
        s.invoke();
            
       }
       
       
    }
    
    public int getMoney() {
        return i;
    }   
    
    public TreeText getTreeText() {
        return pt;
    }
        public PlantText getPlantText() {
        return pp;
    }
        public FlowerText getFlowerText() {
        return pf;
    }
}
