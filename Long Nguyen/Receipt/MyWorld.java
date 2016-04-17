import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Receipt receipt;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        receipt = new Receipt();
        addObject(receipt, getWidth()/2, getHeight()/2);
        CaculatorComponent concreteCaculatorComponent = new ConcreteCalculatorComponent();
        ReceiptComponent big = new BigItem(concreteCaculatorComponent);
        ((BigItem) big).setCost(5);
        ((BigItem) big).setTime(30);        
        ((BigItem) big).setQuantity(2);
        ReceiptComponent medium = new MediumItem((CaculatorComponent) big);
        ((MediumItem) medium).setCost(4);
        ((MediumItem) medium).setTime(20);
        ((MediumItem) medium).setQuantity(1);
        ReceiptComponent small = new SmallItem((CaculatorComponent) medium);
        ((SmallItem) small).setCost(3);
        ((SmallItem) small).setTime(10);        
        ((SmallItem) small).setQuantity(2);        
        receipt.addItem(big);
        receipt.addItem(medium);
        receipt.addItem(small);
      
        receipt.draw();
        
        System.out.println("Total cost: " + ((CaculatorComponent) small).caculCost());
        System.out.println("Total time: " + ((CaculatorComponent) small).caculTime());
    }
}
