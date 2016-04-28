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
    private GameOver gameover;

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
        ((BigItem) big).setQuantity(1);
        
        ReceiptComponent medium = new MediumItem((CaculatorComponent) big);
        ((MediumItem) medium).setCost(4);
        ((MediumItem) medium).setTime(20);
        ((MediumItem) medium).setQuantity(3);
        
        ReceiptComponent small = new SmallItem((CaculatorComponent) medium);
        ((SmallItem) small).setCost(3);
        ((SmallItem) small).setTime(10);        
        ((SmallItem) small).setQuantity(2);    
        
        int totalCost = ((CaculatorComponent) small).caculCost();
        int totalTime = ((CaculatorComponent) small).caculTime();
        
        ReceiptComponent receiptTotal = new ReceiptTotal(totalCost, totalTime);
        
        receipt.addItem(big);
        receipt.addItem(medium);
        receipt.addItem(small);
        receipt.addItem(receiptTotal);
      
        receipt.draw();
        
        gameover = new GameOver();
        addObject(gameover,  getWidth()/6*5, getHeight()/3);
 
        Replay replay = new Replay();
        addObject(replay,  getWidth()/6*5, getHeight()/3*2);

    }
}
