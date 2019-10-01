//Vivian Wong
//September 30, 2019
//Client code for Quadratic Describer -- shows up on the console and handles interactions with the user
//print out results from Quad Describer

import java.util.*;

public class QuadraticClient {
	public static void main(String[]args) {
		Scanner userInput = new Scanner(System.in); //set up a scanner
		double a;		//initialize values
		double b;
		double c;
		boolean contin = true;
		System.out.println("Welcome to the Quadratic Describer! uWu"); //welcome message for user
		while(contin==true) { //start loop
			System.out.println("Please provide values for the coefficients a, b, and c"); //ask for input #s
			System.out.print("a:");
			a= userInput.nextDouble();
			System.out.print("b:");
			b= userInput.nextDouble();
			System.out.print("c:");
			c= userInput.nextDouble();
			
			String description = Quadratic.quadrDescriber(a, b, c); //call first line of description (orientation to axis of symm)
			System.out.println(description);						//print out string
			
			String description2 = Quadratic.xIntercepts(a,b,c); //call 2nd line (x-intercepts)
			System.out.println(description2);					//print out string
			
			String description3 = Quadratic.yIntercept(a, b, c); //call 3rd line (y-int)
			System.out.println(description3);					//print out string
			
			System.out.print("\nDo you wish to continue? If not type \"quit\" to end\n"); //ask go again?
			String answer= userInput.next(); 
			if(answer.equalsIgnoreCase("quit")||answer.equalsIgnoreCase("no")) { //get a response
				contin=false;
			}
		}
		System.out.println("\nThank you for your service!"); //thank you message for user
		System.out.print("Have a nice day! :))");
	}
}



