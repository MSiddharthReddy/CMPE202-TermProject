import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor implements Vehicle, Handler, Observer
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Handler next;
    VehicleState empty;
    VehicleState halfFilled;
    VehicleState fullFilled;
    VehicleState inTransit;
    VehicleState currentState;
    int distance = 0;
    int transitStart = 0;
    int transitEnd = 0;
    int speed = 0;
    boolean returnTrip = false;
    Subject sub;
    
    public Car(Subject sub)
    {
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
        
        if(currentState!=fullFilled && currentState!= inTransit && a < 3)
        {
            System.out.println("Car Packages Before" + pack);
            currentState.assign();}
        else
        {next.assign(a);}
       
    }
    
    public void setState(VehicleState s){
      currentState = s;
    }
    
    public void start(){
        
        int pack = currentState.getPack();
        
        if(currentState!= inTransit){
            System.out.println("Car Starting with" + pack);
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
            currentState.start();
        }
        else
        {next.start();}
    }
    
    public VehicleState getHalf(){return halfFilled;}  
    public VehicleState getFull(){return fullFilled;}
    public VehicleState getIn(){return inTransit;}
    public VehicleState getEmpty(){return empty;}  
    
    public void act(){
        
    }
    
    public void update(int time){
        //System.out.println("" + distance);
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
