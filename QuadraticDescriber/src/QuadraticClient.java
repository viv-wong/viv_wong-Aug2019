//Vivian Wong
//September 27
//Client code describe 

import java.util.*;

public class QuadraticClient {
	public static void main(String[]args) {
		double a;
		double b;
		double c;
		boolean contin = true;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please provide values for the coefficients a, b, and c");
		System.out.print("a: \nb: \nc:");
			a= userInput.nextDouble();
			b= userInput.nextDouble();
			c= userInput.nextDouble();
		String description = Quadratic.quadrDescriber(a, b, c);
		System.out.println(description);
		System.out.println("Do you wish to continue? If not type \"quit\" to end");
			answer= userInput.next();
			if(contin==true)
		
	}
}

/*set up a scanner
welcome message
start game loop
ask for input
call quadrDescriber and send it the inputs
print out returned string
ask go again
get a response
*/