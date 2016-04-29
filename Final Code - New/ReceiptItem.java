/**
 * Write a description of class ReceiptItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiptItem extends Leaf implements CaculatorComponent 
{
    CaculatorComponent component;
    
    public ReceiptItem(CaculatorComponent c) {
            super();
            this.component = c;
    }
    
    public int caculCost() {
        return component.caculCost();
    }
    
    public int caculTime() {
       return component.caculTime();
    }
}
