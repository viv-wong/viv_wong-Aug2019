//Vivian Wong
//October 4, 2019
//the result of a collaborative programming exercise in class

import java.util.*;
//some issues with largest even number; in the process of fixing
public class ProcessingNumbers {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in); //set up a scanner
		System.out.println("Welcome!"); //welcome message (optional)
		System.out.println("How many numbers would you like to enter?: "); //ask for amount of #s
		int times= userInput.nextInt(); //initialize the # of times 
		System.out.println("Please input the first value: "); //input message for first value
		
		int max= userInput.nextInt(); //initialize variables 
		int min= max;
		int output=max;
		int sum=0;
		
		System.out.println("Please input the rest of your values: "); //ask for the rest of the values
		for (int i=1; i<times;i++) { //start for loop for the amount of times 
			int value= userInput.nextInt(); //initialize the value #
			if(value>max) {  //if/else for determining maximum number
				max=value;	 	
			} else if (value<max) { //if/else if for determining minimum number
				min=value;	
			}
			if(value%2==0) { //if statement to determine even numbers
				sum+=value; //update 
			}
			if(value>output) {//if statement to find largest even number
				output=value; 
				
			}
		}
		System.out.println("The minimum is: "+ min+ "\nThe maximum is: "+ max);
		System.out.println("\nThe sum of all the even numbers is: "+ sum+"\nThe largest even number is: "+ output);
	}		//return outputs
}
	

