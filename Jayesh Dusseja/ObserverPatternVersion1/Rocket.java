import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor implements Vehicle, Handler, Observer
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
    Subject sub;
    int distance = 0;
    int transitStart = 0;
    int transitEnd = 0;
    int speed = 0;
    boolean returnTrip = false;
    
    public Rocket(Subject sub){
        this.sub = sub;
        sub.attach(this);
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
             distance = ((this.getWorld().getObjects(Destination.class)).get(0).getX()) - this.getX();
            transitStart = Timer.totalTime;
            if(pack == 0){
                transitEnd = transitStart - 10;
                speed = (distance * 2) / 10;
            }
            else if(pack == 1){
                transitEnd = transitStart - 20;
                speed = (distance * 2) / 20;
            }
            else if(pack == 2){
                transitEnd = transitStart - 30;
                speed = (distance * 2) / 30;
            }
            returnTrip = false;
             currentState.start();}
        else
        {currentState.start();
        }
        
    }
    
   public VehicleState getHalf(){return halfFilled;}  
   public VehicleState getFull(){return fullFilled;}  
   public VehicleState getIn(){return inTransit;}  
   public VehicleState getEmpty(){return empty;} 

   public void update (int time){
       if(currentState.getClass().getName() == "InTransit"){
            if(time >= transitEnd){
                if(!returnTrip){
                    move(speed);
                    if(getX() >= (this.getWorld().getObjects(Destination.class)).get(0).getX())
                        returnTrip = true;
                }
                else
                    move(-speed);
            }
        }
   }
}
