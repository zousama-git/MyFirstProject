public class Main{
	public static void main(String[] args){
		/*Car car1 = new Car("Musteng","Red");
		Car car2 = new Car("Corvette","Blue");
		Car car3 = new Car("Charger","Yellow");

		Car[] cars = {car1, car2, car3};
		
		for(int i = 0; i<cars.length; i++){
			cars[i].drive();
		}*/
		
		Car[] cars = {	new Car("Musteng","Red"),
						new Car("Corvette","Blue"),
						new Car("Charger","Yellow")
		};
		
		for(Car car : cars){
			car.colour = "Black";
			car.drive();
		}
	}
}