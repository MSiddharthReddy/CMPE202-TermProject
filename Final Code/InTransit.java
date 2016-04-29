/**
 * Write a description of class InTransit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InTransit  implements VehicleState
{
    // instance variables - replace the example below with your own
    
   public int pack;
   Vehicle s;
    /**
     * Constructor for objects of class Empty
     */
    public InTransit(Vehicle s){
     
      this.s = s;
      
    }
   public void assign(){
       
        
        
        System.out.println("ALl Vehicles InTransit Cannot Assign");
       
        
    
   }
   public int getPack()
    {
          return pack;
    }   
    
    
    public void start(){
        
       System.out.println("ALl Vehicles InTransit Cannot Start");
    }
}
