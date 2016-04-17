
public class CarFactory {
	public Car getCar(String carType)
	{
		Car car = null;
		if(carType=="Big")
		{
			car= new BigCar();
			System.out.println("Big car");
		}
		else if(carType=="Medium")
		{
			car = new MediumCar();
			System.out.println("Small car");
		}
		else if(carType=="Small")
		{
			car = new SmallCar();
			System.out.println("Medium car");
		}
		return car;
	}
}
