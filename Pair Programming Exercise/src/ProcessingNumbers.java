//Vivian Wong
//October 4, 2019
//the result of a collaborative programming exercise in class

import java.util.*;

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
		int maxEven=0;
		int sum=0;
		boolean foundEven=false;
		
			if(max%2==0) {		//make conditional to find even numbers
				maxEven=max;
				sum=max;
				foundEven=true;
			}
			
			//for(int i=1; i<=times-1;i++) {
				System.out.println("Please input the rest of your values: ");
				for(int i=1; i <=times-1;i++) {
				int nextNum=userInput.nextInt();
				
				if(nextNum>max) { //finds the max
					max=nextNum;
				}
				if(nextNum<min) {	//finds the minimum
					min=nextNum;
				}
				
				if(nextNum%2==0) {		//finds the maximum even number
					if(nextNum>maxEven) 
					maxEven=nextNum;
					foundEven=true;
			}	
				if(nextNum%2==0) {	//find sum of all even numbers
					sum+=nextNum;
					foundEven=true;
				}}
				userInput.close(); //closes scanner
	
		if(foundEven==true) {
			System.out.println("The minimum is: "+ min+ "\nThe maximum is: "+ max);
			System.out.println("\nThe sum of all the even numbers is: "+ sum+"\nThe largest even number is: "+ maxEven);
		}
}}
			

