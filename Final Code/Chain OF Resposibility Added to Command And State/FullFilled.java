/**
 * Write a description of class FullFilled here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FullFilled  implements VehicleState
{
    public int pack = 2;
    Vehicle s;
    
    /**
     * Constructor for objects of class Empty
     */
    public FullFilled(Vehicle s){
      this.s = s;
    }
    
    public int getPack()
    {
          return pack;
    }
    
    public void assign(){
        pack = 2;
        System.out.println("Already Full Press Start");
    }
   
    public void start(){
        
        s.setState(s.getIn());
    }
}
