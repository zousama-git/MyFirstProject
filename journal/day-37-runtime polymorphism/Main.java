import java.util.Scanner;

abstract class Animal{
	abstract void speak();
}

class Dog extends Animal{
	@Override
	void speak(){
		System.out.println("BARK!");
	}
}

class Cat extends Animal{
	@Override
	void speak(){
		System.out.println("MEOW!");
	}
}

public class Main{
	public static void main(String [] args){
		Animal animal;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Cat [C]/ Dog [D]");
		char choice = input.nextLine().toUpperCase().charAt(0);
		
		if (choice == 'D'){
			animal = new Dog();
			animal.speak();
		} else if (choice == 'C'){
			animal = new Cat();
			animal.speak();
		} else System.out.println("Wrong choice");
	}
}