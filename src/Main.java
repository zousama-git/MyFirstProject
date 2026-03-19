import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //day 1
        //This is my first java project
        /*
        This is a multiline comment
         */
        System.out.println("Day 1");
        System.out.print("I am zou!\n");
        System.out.println("I am the real zousama!");
        System.out.print("Buy me pizza \n");
        //type system 'sout' for fast System.out.println();

        /* day 2
        Part 1
        Variables */

        System.out.println("");
        System.out.println("Day 2");

        int iAge = 21;

        double Price = 16.56;
        double GPA = 3.5;
        double Temperature = 26;

        char Grade = 'A';
        char Symbol = '!';
        char Currency = 'R';

        boolean isStudent = true;
        //boolean forSale = false;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "zou";
        String food = "pizza";
        String email = "fake123@gmail.com";

        System.out.println("I am "+ iAge + " years old");
        System.out.println("R" + Price + ", " +GPA+", "+Temperature+" Celsius");
        System.out.println(Grade +" "+ Currency +" "+ Symbol);
        System.out.println(isStudent +" "+ isOnline +" "+ forSale);
        System.out.println("Hello "+ name + ", I like " + food +" and your email is "+ email);
        System.out.println(iAge +" "+ name +" "+ Price +" "+ Grade);

        //side quest
        //no need to say (isStudent == true) but just (isStudent)
        if (isStudent == true) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are not a student");
        }

        //remove if since (forSale will always be false)
        if (forSale == false) {
            System.out.println(name + " will not sell it to you"+ Symbol);
        }
        else {
            System.out.println(name +" will sell it to you" +Symbol);
        }
    }
}
