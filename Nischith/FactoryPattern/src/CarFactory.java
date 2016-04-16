
public class CarFactory {
	public Car getCar(String carType)
	{
		Car car = null;
		if(carType=="Big")
		{
			car= new BigCar();
		}
		else if(carType=="Medium")
		{
			car = new MediumCar();
		}
		else if(carType=="Small")
		{
			car = new SmallCar();
		}
		return car;
	}
}
