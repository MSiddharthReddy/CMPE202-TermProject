/**
 * Write a description of class StartIn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartIn implements Command
{
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Vehicle v;
    public StartIn (Vehicle v){
        
        this.v = v;
    }
    
    public boolean execute(int a) 
    {
        // Add your action code here.
        return (v.start());
    }    
    
    public void act(){
    }
}
