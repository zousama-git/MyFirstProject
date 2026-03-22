import java.util.Scanner;

public class if_statement {
    static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.isEmpty()){
            System.out.println("You did not enter your name!");
        }
        else {
            System.out.print("Hi "+name +", how old are you?: ");
            int age = scanner.nextInt();

            //It is better to do these in sequences since it takes the recently true first
            if (age>=18) {
                System.out.println("You are an adult");
            } else if (age==0) {
                System.out.println("You are just born");
            } else if (age<0) {
                System.out.println("You are NOT yet born");
            } else if (age<12) {
                System.out.println("You NOT a teenager");
            } else {
                System.out.println("You are a teenager");
            }
        }

        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are NOT a student");
        }
    }
}
