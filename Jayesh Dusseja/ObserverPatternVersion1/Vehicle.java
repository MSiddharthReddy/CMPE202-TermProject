/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Vehicle  
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Vehicle
     */
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void assign(int a);
    //public void run();
    //public void change();
    public void start();
     public VehicleState getHalf(); 
   public VehicleState getFull(); 
   public VehicleState getIn(); 
   public VehicleState getEmpty(); 
   public void setState(VehicleState s);
}
