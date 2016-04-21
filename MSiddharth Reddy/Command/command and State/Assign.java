/**
 * Write a description of class TreeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assign implements Command
{
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Vehicle v;
    public Assign (Vehicle v){
        
        this.v = v;
    }
    
    public void execute(int a) 
    {
        // Add your action code here.
        v.assign(a);
    }    
    
    public void act(){
    }
}

