/* Vivian Wong
 * August 29, 2019
 * Period 4
 * Group of methods that perform math calculations (a library)
 */

 //Part 1

//returns the square of the value passed
public class Calculate { 
	public static int square(int number) {
		int answer=0;
		answer=number*number;  
		return answer;	
	}
	//returns the cube of the value passed
	public static int cube(int number) { 
		int answer=number*number*number;
		return answer;
	}
	//returns the average of the values passed to it
	public static double average(double x, double y){ 
		double answer=(x+y)/2;
		return answer;
	}
	// returns the average of 3 values passed to it;example of 'overloading'
	public static double average(double x, double y, double z){ 
		double answer=(x+y+z)/3;
		return answer;
	}
	// converts an angle measure given in radians into degrees
	public static double toDegrees(double number){
		double answer=number*(180/3.14159);
		return answer;
	}
	//converts an angle measure given in degrees into radians
	public static double toRadians(double number) {
		double answer= number*(3.14159/180);
		return answer;
	}
	//returns the value of the discriminant
	public static double discriminant(double a, double b, double c) {
		double answer=b*b-(4*a*c);
		return answer;
	}
	//converts mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator){
		int answer= (whole*denominator)+numerator;
		return answer + "/" +denominator;
	}
	//converts an improper fraction into a mixed number
	public static String toMixedNum(int a, int b) { 
		;
		return answer;
	}
	//converts a binomial multiplication form into a quadratic equation form
	public static String foil(int a, int b, int c, int d, String n) {
		String answer= "(a*c)n +";
		return answer;
	}
//Part Two
	//determines whether or not one integer is evenly divisible by another
	public static  isDivisibleBy(int x, int y)
		
	
}











