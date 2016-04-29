/**
 * Write a description of class ReceiptComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ReceiptComponent  
{
    public void draw();
    public void addItem(ReceiptComponent component);
    public ReceiptComponent getItem(int i);
    
}
