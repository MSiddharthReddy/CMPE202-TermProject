import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat extends Actor implements Vehicle, Handler
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
    
    public void assign(int a)
    {
          int pack = currentState.getPack();
        
        if(currentState != fullFilled && currentState!= inTransit)
        {System.out.println("Boat Packages Beofre" + pack);
            currentState.assign();}
        else
        {next.assign(a);}
       
    }
    public void setState(VehicleState s)
    {
      currentState = s;   
    }
    
   public void start(){
        
       int pack = currentState.getPack();
        
        if(currentState!= inTransit)
        {System.out.println("Boat Starting with" + pack);
            currentState.start();}
        else
        {next.start();}
        
    }
    
   public VehicleState getHalf(){return halfFilled;}  
   public VehicleState getFull(){return fullFilled;}  
   public VehicleState getIn(){return inTransit;}  
   public VehicleState getEmpty(){return empty;} 
      
}
