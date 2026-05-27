import java.util.Scanner;
import java.util.InputMismatchException;


public class Main{
	public static void main(String [] args){
		
		try(Scanner input = new Scanner(System.in)){
			System.out.println("Enter a number: ");
			int number = input.nextInt();
			input.nextLine();
			System.out.println("Enter a number: ");
			
			int x = 9/0;
		} catch (ArithmeticException e){
			System.out.println("Cannot "+e.getMessage());
		}  catch (InputMismatchException e){
			System.out.println("That was not a number! so we will give you a "+e.getMessage());
		} catch (Exception e){
			//safety net
			System.out.println("Something went wrong");
		} finally{
			System.out.println("Code ends here");
		}
	}
}