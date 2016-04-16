import java.util.Scanner;

public class Player {
	public static void main(String[] args)
	{
		CarFactory carFactory= new CarFactory();
		System.out.println("Enter 1. To select big car 2. To select Medium car 3. To select small car");
		Scanner inputReader = new Scanner(System.in);

		int inputData = Integer.parseInt(inputReader.nextLine());

		switch(inputData){
		case 1:carFactory.getCar("Big");
		break;
		case 2:carFactory.getCar("Medium");
		break;
		case 3:carFactory.getCar("Small");
		break;

		}

	}
}
