import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor implements Vehicle, Handler, Subject2, Observer
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
    VehicleOverhead c;
     VehicleFactory f = new VehicleFactory();
      private ArrayList<Observer> obs = new ArrayList<Observer>();
        int distance = 0;
    int transitStart = 0;
    int transitEnd = 0;
    int speed = 0;
    boolean returnTrip = false;
    TimerSubject sub;
    Receipt receipt;
    public Rocket(TimerSubject sub)
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
    
        public void setReceipt(Receipt r) {
        receipt = r;
    }
    
    public boolean assign(int a)
    {
        int pack = currentState.getPack();
       
        
        if(currentState!=fullFilled && currentState!= inTransit && a < 2)
        { System.out.println("Rocket Packages before " + pack);
            currentState.assign();
            
            return true;}
        else
        { //currentState.assign();}
        return false;
       
    }
        
    }
    public void setState(VehicleState s)
    {
      currentState = s;   
    }
    
   public boolean start(){
        
       int pack = currentState.getPack();
       
        if(currentState!= inTransit)
        {
             System.out.println("Rocket Starting with" + pack);
             currentState.start();
             c = f.makeSet("R", pack);
            //System.out.println(c.getPrice() + " " + c.getTime());
            notifyObservers(c.getPrice());
             int i = c.getTime();
            distance = ((this.getWorld().getObjects(Destination.class)).get(0).getX()) - this.getX();
            transitStart = Timer.totalTime;
             transitEnd = transitStart - i;
                speed = (distance * 2) / i;
                
                  ReceiptComponent small = new SmallItem((CaculatorComponent)receipt.getLastItem());
        ((SmallItem) small).setCost(1);
        ((SmallItem) small).setTime(i);        
        ((SmallItem) small).setQuantity(1);    
        
         receipt.addItem(small);
            return true;}
        else
        {return false;
        }
        
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
    public void update(int time){
        //System.out.println("" + distance);
        if(currentState.getClass().getName() == "InTransit"){
            if(time >= transitEnd){
                if(!returnTrip){
                    move(speed);
                    if(getX() >= (this.getWorld().getObjects(Destination.class)).get(0).getX())
                        returnTrip = true;
                }
                else{
                    setRotation(180);
                    move(speed);
                }
            }
            else
            {
                setState(getEmpty());
                turn(180);
                returnTrip = false;
            }
        }
    }
   
}
