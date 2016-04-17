/**
 * Write a description of class MediumItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumItem extends ReceiptItem 
{
   private int cost;
    private int time;
    private int quantity;
    
    public MediumItem(CaculatorComponent c) {
        super(c);
    }
    
    public int caculCost() {
        return cost * quantity + super.caculCost();
    }
    
    public int caculTime() {
        return time * quantity + super.caculTime();
    } 
    
    public void setCost(int c) {
        cost = c;        
    }
    
    public int getCost() {
        return cost;
    }
    
    
    public void setTime(int t) {
        time = t;        
    }
    
    public int getTime() {
        return time;
    }
    
    public void setQuantity(int q) {
        quantity = q;
    }
    
    
    public int getQuantity() {
        return quantity;
    }
}
