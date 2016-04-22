/**
 * Write a description of class Empty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empty implements VehicleState
{
    // instance variables - replace the example below with your own   
    public int pack = 0;
    Vehicle s;
    /**
     * Constructor for objects of class Empty
     */
    public Empty(Vehicle s){
        this.s = s;
    }
    
    public int getPack()
    {
        return pack;
    }
    
    public void assign(){
        pack = 1;
        System.out.println("Now" + pack);
        s.setState(s.getHalf());
    }    
   
    public void start(){
        s.setState(s.getIn());
    }
}
