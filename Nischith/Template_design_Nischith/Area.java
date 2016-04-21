import greenfoot.*;  
public class Area extends World
{

    public Area()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        BigCar bigCar = new BigCar();
        addObject(bigCar, 100, 100);
        MediumCar mediumCar = new MediumCar();
        addObject(mediumCar, 75, 75);
        SmallCar smallCar = new SmallCar();
        addObject(smallCar, getWidth(), getHeight());
        
        House house = new House();
        addObject(house, getWidth(), getHeight());
    }
    
}
