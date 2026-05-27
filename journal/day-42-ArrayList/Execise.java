import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Execise {
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);

		ArrayList<String> numbers = new ArrayList<String>();
		
		System.out.print("Enter the number of food you like:");
		int n = input.nextInt();
		input.nextLine();

		for(int i = 0; i<n; i++){
			System.out.printf("Enter the name of food %d: ", i + 1);
			String food = input.nextLine();
			numbers.add(food);
		}
		
		System.out.println("\nThe food you like are:");
		for(String food : numbers){
			System.out.println(food);
		}

		input.close();
	}
}