import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat extends Actor implements Vehicle, Handler,Subject2
{
    /**
     * Act - do whatever the Boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Handler next;
     VehicleState empty;
     VehicleState halfFilled;
     VehicleState fullFilled;
      VehicleState inTransit;
    VehicleState currentState;
    VehicleOverhead c;
     VehicleFactory f = new VehicleFactory();
      private ArrayList<Observer> obs = new ArrayList<Observer>();
    public Boat(){
             empty = new Empty(this);
        halfFilled = new HalfFilled(this);
        fullFilled = new FullFilled(this);
        inTransit = new InTransit(this);
        currentState = empty;
        
    }
     public void setSuccessor(Handler next){
    
        this.next = next;
    }
    
    public boolean assign(int a)
    {
          int pack = currentState.getPack();
        
        if(currentState != fullFilled && currentState!= inTransit)
        {
            System.out.println("Boat Packages Beofre" + pack);
            currentState.assign();
            return true;
        }
        else
        {
        return (next.assign(a));
    }
       
    }
    public void setState(VehicleState s)
    {
      currentState = s;   
    }
    
   public boolean start(){
        
       int pack = currentState.getPack();
        
        if(currentState!= inTransit)
        {System.out.println("Boat Starting with" + pack);
            currentState.start();
            c = f.makeSet("B", pack);
            //System.out.println(c.getPrice() + " " + c.getTime());
            notifyObservers(c.getPrice());
        return true;}
        else
        {return (next.start());}
        
    }
    
   public VehicleState getHalf(){return halfFilled;}  
   public VehicleState getFull(){return fullFilled;}  
   public VehicleState getIn(){return inTransit;}  
   public VehicleState getEmpty(){return empty;} 
      
   public void addObserver(Observer o){
        obs.add(o);
    }
    
    public void notifyObservers(int pack)
    {
        for (Observer obj: obs){
            obj.update(pack);
        }
    }
}