import java.util.Scanner;

public class mad_libs {
    static void main(String[] args) {
        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1, noun1, verb1, adjective2, adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter an noun (animal or person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter an verb ending with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\n Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a "+ noun1 + ".");
        System.out.println(noun1+" was " +adjective2+" and "+verb1+"!");
        System.out.println("I was "+adjective3+ "!");

        scanner.close();
    }
}
