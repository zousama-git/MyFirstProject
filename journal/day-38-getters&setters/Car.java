public class Car{
	
	private final String model;
	private String colour;
	private int price;
	
	Car(String model, String colour, int price){
		this.model = model;
		this.colour = colour;
		this.price = price;
	}
	
	//readable
	String getModel(){
		return this.model;
	}
	
	String getColour(){
		return this.colour;
	}
	
	String getPrice(){
		return "R"+this.price;
	}
	
	//writeable
	void setColour(String colour){
		this.colour = colour;
	}
	
	void setPrice(int price){
		
		if (price < 0 ) System.out.println("Price cannot be less than zero");
			else this.price = price;
	}
}