/**
 * Write a description of class invoke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class invoke implements invoker
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class invoke
     */
    private Command c;
    public invoke(Command c)
    {
        this.c = c;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void execute(){
        
        c.execute();
    }
}
