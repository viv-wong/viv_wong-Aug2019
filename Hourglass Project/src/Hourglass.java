//Vivian Wong
//October 25, 2019
//creating an hourglass that prints out in 11 lines and uses less than 11 print lines, using nested loops, 



public class Hourglass {
	public static void main(String[]args) {
		line();
		topHalf();
		System.out.print("     ||\n");
		bottomHalf();
		line();
			
			} // end main
	public static void line() {
		System.out.print("|\"\"\"\"\"\"\"\"\"\"|\n");
	}
			
	public static void topHalf(){
			for (int line = 5; line >= 2; line--) {
			// blanks on left
				
			for (int blank = 1; line <= 6 - blank; blank++) {
				System.out.print(" ");
			} // end left blanks loop
				System.out.print("\\");
			// colons
			for (int colons = 1; colons <= 2 * line - 2; colons++) {
				System.out.print (":");
			} // end colon loop
				System.out.print("/\n");
			}}
			
			
	public static void bottomHalf(){
			for (int line = 2; line <= 5; line++) {
			// blanks on left
			for (int blank = 1; line <= 6 - blank; blank++) {
				System.out.print(" ");
			} // end left blanks loop
				System.out.print("/");
			// colons
			for (int colons = 1; colons <= 2 * line - 2; colons++) {
				System.out.print (":");
			} // end colon loop
				System.out.print("\\\n");
		
			
			} // end right blanks loop
			}
		
			} // end bottomHalf
			

	
			
			
		
		

		