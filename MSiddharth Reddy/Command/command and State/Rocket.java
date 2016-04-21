import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor implements Vehicle, Handler
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Handler next;
    VehicleState empty;
     VehicleState halfFilled;
     VehicleState fullFilled;
      VehicleState inTransit;
    VehicleState currentState;
    public Rocket(){
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
       
        
        if(currentState!=fullFilled && currentState!= inTransit && a < 2)
        { System.out.println("Rocket Packages before " + pack);
            currentState.assign();}
        else
        { //currentState.assign();}
    }
        
    }
    public void setState(VehicleState s)
    {
      currentState = s;   
    }
    
   public void start(){
        
       int pack = currentState.getPack();
       
        if(currentState!= inTransit)
        {
             System.out.println("Rocket Starting with" + pack);
             currentState.start();}
        else
        {currentState.start();
        }
        
    }
    
   public VehicleState getHalf(){return halfFilled;}  
   public VehicleState getFull(){return fullFilled;}  
   public VehicleState getIn(){return inTransit;}  
   public VehicleState getEmpty(){return empty;} 

   
}
