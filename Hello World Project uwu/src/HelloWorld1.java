//Vivian Wong
//August 19, 2019
//First class iconic intro to Java for APCS 
/*
 * Prints a message to the screen
 */


public class HelloWorld1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		String line = "   |";
		String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
		for (int i = 0; i <= 11; i++) {
			line += array[i] + "         |";
		}
		for (int row = 0; row <= 19; row++) {
			if(row < 9) {
				line += "\n" + (row+1) + "  |";
			} else if(row >= 9) {
				line += "\n" + (row+1) + " |";
			}
			for(int col = 0; col <= 11; col++) {
				line += "          |"; 			}
			}
		System.out.println(line);
	}}
		
	
	