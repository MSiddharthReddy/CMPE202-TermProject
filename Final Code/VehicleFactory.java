/**
 * Write a description of class VehicleFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VehicleFactory  
{
    // instance variables - replace the example below with your own
    public VehicleOverhead makeSet(String newType, int pack){
	         
        VehicleOverhead newOver = null;
	         	        if (newType.equals("C")){
             
	            return new CarSet(pack);
	             
	        } else	         
	        if (newType.equals("B")){
	             
	            return new BoatSet(pack);
	             
	        } else
	         
	        if (newType.equals("R")){
	             
	            return new RocketSet(pack);
	             
	        } else return null;
	         
	    }
}
