//Vivian Wong
//October 25, 2019
//creating an hourglass that prints out in 11 lines and uses less than 11 print lines, using nested loops, 

import java.util.*;

public class Hourglass {
	public static void main(String[]args) {
		Scanner userInput = new Scanner(System.in); 
		System.out.println("Please enter the size of your desired hourglass: ");
		int size=userInput.nextInt();
		
			System.out.print("|");
		for (int quote=1;quote<=size;quote++) {
			System.out.print ("\"");
		}
			System.out.println("|");
			
		for (int line=1;line<=4; line++) {
			for (int space=0; space<line; space++) {
			System.out.print(" ");
			System.out.print("\\");
		for (int colon=1; colon<=-2*line+10;colon++) {
			System.out.print(":");
		}
			System.out.println("/");
			}
		}
}
}