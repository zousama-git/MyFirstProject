public class Car {
	String model;
	String colour;
	
	Car(String model, String colour){
		this.model = model;
		this.colour = colour;
	}
	
	void drive(){
		System.out.printf("You drive the %s %s\n", this.colour, this.model);
	}
}