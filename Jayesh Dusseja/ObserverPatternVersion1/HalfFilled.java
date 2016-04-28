/**
 * Write a description of class HalfFIlled here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HalfFilled implements VehicleState
{
    // instance variables - replace the example below with your own
    
   public int pack = 1;
   Vehicle s;
    /**
     * Constructor for objects of class Empty
     */
    public HalfFilled(Vehicle s){
     
      this.s = s;
      
    }
    public int getPack()
    {
          return pack;
    }
   public void assign(){
       
        pack = 2;
        
        System.out.println(" Now" + pack);
        s.setState(s.getFull());
        
    
   }
   
    
    
    public void start(){
        s.setState(s.getIn());
    }
   
}
   