/**
 * Write a description of class VehicleOverhead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public abstract class VehicleOverhead
{
    // instance variables - replace the example below with your own
   
    int price;
    int time;
   public void setPrice(int a)
   {
       price = a;
    }   
    
    public int getPrice(){
        return price;
    }
    
    public void setTime(int a)
   {
       
       switch(a){
           case 0: time = 5;
                   break;
           case 1: time = 10;
                   break;
           case 2: time = 20;
                   break;
                }
    }   
    
    public int getTime(){
        return time;
    }
    
}
