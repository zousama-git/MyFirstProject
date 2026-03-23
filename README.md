Day 1
1. First Project
   (main.java)
    Started a New Project
    Made a Java File: Inside project, I would created a new Java class file named Main.

2. The Main Method for every Java program to run:
   public static void main(String[] args) { ... }
   Printed a Message: Using the command System.out.println("xyz");

3. Running and Testing
    Learned Shortcuts
    Added Notes: // and */ */
================================================================

Day 2

(main.java)
1. Learned the Two Steps of Creating a Variable
	Declaration: Telling the computer the type and name
	Assignment: Giving that variable a specific value using the equals sign

2. Mastered the Four "Primitive" Data Types
	int (Integers)
	double
	char
	boolean

3. "Reference" Types (Strings)
	Strings

4. Practiced buy builing descriptive sentences in the console:
	Mixing strings, numbers, and symbols etc.
	Using a Boolean to toggle a message

(variables_input.java)

5. Getting the "Scanner" Tool
	declaring variable java.util.Scanner;
	Setting it up: Scanner scanner = new Scanner(System.in);
	Closing it: scanner.close(); 

6. Different types
	Words (Strings): Using scanner.nextLine(); to ask for a name
	Numbers (Integers): Using scanner.nextInt(); to ask for an age
	Decimals (Doubles): Using scanner.nextDouble(); to ask for a GPA
	True/False (Booleans): Using scanner.nextBoolean(); to ask if someone is a student

7. Fixing a Common "Bug"
	Java "glitch", if you ask for a number and then a word, the program sometimes skips the word! 
	Then "clean" the scanner by adding an extra scanner.nextLine(); in between

9. Built a "Rectangle Calculator"
================================================================

Day 3
1. Built a Mad Libs game to practice using the Scanner class to handle multiple user inputs and combine them into a story. Example: If the user enters "adjective," "noun," "adjective," "verb," and "adjective."
2. Arithmetic
  	a) Basic Arithmetic Operators
		Addition (+)
		Subtraction (-)
		Multiplication (*)
		Division (/)
		Modulus (%) (This gives you the remainder of a division)

	b) Augmented Assignment Operators
		These are shortcuts for performing an operation and then reassigning the result to the same variable
		Addition: x += y is the same as x = x + y
		Subtraction: x -= y
		Multiplication: x *= y
		Division: x /= y

	c) Increment and Decrement
		Commonly used in loops, these operators change a value by exactly 1
		Increment (++): x++ increases the value by 1
		Decrement (--): x-- decreases the value by 1

	d) Order of Operations (PEMDAS or BODMAS)
================================================================

Day 4
1. Built a simple Shopping Cart Program in Java as a follow-up exercise to practice user input, variables, and basic arithmetic.
	Input: Ask the user for the item name (string), price (double), and quantity (integer)
	Process: Calculate the total cost by multiplying price and quantity (total as double) (total = price * quantity;)
	Output: Display a summary of the purchase (R as charcter) and the final total
		"You have bought [quantity] [item]/s"
		"Your total is: R[total]"

2. If statements
	a) An if statement checks a condition inside parentheses. If the condition is true, the code inside the curly braces {} runs. If it's false, the program skips it
		else: Acts as a "catch-all"
		else if: Allows you to check multiple, specific conditions in a row

	b) Important Rules to Remember is that
		Order Matters
		To check if two things are equal, use the double equals (==) operator
		When working with booleans, you don't need to write if (isStudent == true). You can simply write if (isStudent)
