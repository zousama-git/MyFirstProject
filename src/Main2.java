import java.util.Scanner;
public class Main2 {
    //note that I removed the "public" before "static"
     static void main(String[] args) {
        //after adding the util, you'll add a scanner
        Scanner scanner = new Scanner(System.in);

        /* this type will only read the first word
        String name = scanner.next(); */
        //string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //double
        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        //boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("_____________________________ \n");
        System.out.println("Hello, " + name);
        System.out.println("You are " + age+ " years old");
        System.out.println("Your GPA is: "+gpa);

        //System.out.println("Student: "+isStudent);

        //this is simplified from (isStudent == true) to (isStudent)
        if (isStudent) {
            System.out.println("You are enrolled as a student");
        }
            else {
            System.out.println("You are NOT enrolled");
        }

        //Common issues
         System.out.print("Age: ");
         int iAge = scanner.nextInt();

         //to fix the issue
         scanner.nextLine();

         System.out.print("Colour: ");
         String colour = scanner.nextLine();

         System.out.println("You are "+iAge+ " years old");
         System.out.println("You like the colour " +colour);

         //Calculate the area of a rectangle

         //faster way to declare your variables
         double width, length, area =0;

         System.out.print("Enter your length: ");
         length = scanner.nextDouble();

         System.out.print("Enter your width: ");
         width = scanner.nextDouble();

         area = width * length;

         //NumLock + Alt + 0178 for super-script
         System.out.println("Your area is: "+area+" cm²");

         //close the scanner
        scanner.close();
    }
}
