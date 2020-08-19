package template;

public class CarTest {

	public static void main(String[] args) {

		Car mycar=new ManualCar();
		mycar.run();
		
		
		Car yourCar=new AICar();
		yourCar.run();
	}

}
