interface Predator{
	void hunt();
}
interface Prey{
	void flee();
}

class Rabbit implements Prey{
	@Override
	public void flee(){
		System.out.println("Rabbit is fleeing");
	}
}

class Hawk implements Predator{
	@Override
	public void hunt(){
		System.out.println("Hawk is hunting");
	}
}

class Fish implements Predator, Prey{
	@Override
	public void hunt(){
		System.out.println("Fish is hunting");
	}
	
	@Override
	public void flee(){
		System.out.println("Fish is swiming away");
	}
}


public class Main{
	public static void main(String [] args){
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		Fish fish = new Fish();
		
		rabbit.flee();
		hawk.hunt();
		fish.hunt();
		fish.flee();
	}
}