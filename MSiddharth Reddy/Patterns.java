//Cab is an interface for all the cabs that we are implementing in our project.
//Command is an interface which is implemented by the command classes Start and Stop.
//Start and Stop are classes or commands.

Command pattern

public static void main(String[] args)
{
	Cab newCab = Target.getCab();
	
	Command start = new Start(newCab());
	Command big = new BigCab(newCab());
    Command med = new BigCab(newCab());
    Command small = new BigCab(newCab());
	
	CabInvoker invoke;
   //switch between the invoker according to the button being pressed
        invoke = new Cab(start);

		invoke = new Cab(big);
        invoke = new Cab(med);
        invoke = new Cab(small);

	invoke.press();
}


