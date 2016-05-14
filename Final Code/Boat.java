import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat extends Actor implements Vehicle, Handler,Subject2, Observer
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
      int distance = 0;
    int transitStart = 0;
    int transitEnd = 0;
    int speed = 0;
    boolean returnTrip = false;
    TimerSubject sub;
    Receipt receipt;
    public Boat(TimerSubject sub)
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
     public VehicleState getState()
    {
      return currentState;   
    }
    
   public boolean start(){
        
       int pack = currentState.getPack();
        
        if(currentState!= inTransit)
        {System.out.println("Boat Starting with" + pack);
            currentState.start();
            c = f.makeSet("B", pack);
            //System.out.println(c.getPrice() + " " + c.getTime());
            notifyObservers(c.getPrice());
            int i = c.getTime();
            distance = ((this.getWorld().getObjects(Destination.class)).get(0).getX()) - this.getX();
            transitStart = Timer.totalTime;
             transitEnd = transitStart - i;
                speed = (distance * 2) / i;
                
       ReceiptComponent big = new BigItem((CaculatorComponent)receipt.getLastItem());
        ((BigItem) big).setCost(3);
        ((BigItem) big).setTime(i);        
        ((BigItem) big).setQuantity(1);
           receipt.addItem(big);
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
     public void update(int time){
        //System.out.println("" + distance);
        if(currentState.getClass().getName() == "InTransit"){
            if(time >= transitEnd){
                if(!returnTrip){
                    move(speed);
                    if(getX() >= (this.getWorld().getObjects(Destination.class)).get(0).getX()) {
                        returnTrip = true;
                        setRotation(180);
                    GreenfootImage img = getImage();
                    img.mirrorVertically();
                    setImage(img);
//                    move(-speed);
                    }
                }
                else {
                    
                    move(speed);
                }
            }
            else{
                setState(getEmpty());
                setRotation(360);
                 GreenfootImage img = getImage();
                    img.mirrorVertically();
                    setImage(img);
                returnTrip = false;
            }
        }
    }
}
