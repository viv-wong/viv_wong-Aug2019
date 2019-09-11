/* Vivian Wong
 * August 29, 2019
 * Period 4
 * Group of methods that perform math calculations (a library)
 */

 //Part 1

public class Calculate {
	public static int square(int number) {
		return number*number;	
		}
	public static int cube(int number) {
		return number*number*number;
		}
	public static double average(double x, double y){
		return (x+y)/2;
		}
	public static double average(double x, double y, double z){
		return (x+y+z)/3;
		}
	public static double toDegrees(double number){
		return number*(180/3.14159);
	}
	public static double toRadians(double number) {
		return number*(3.14159/180);
	}
	public static double discriminant(double a, double b, double c) {
		return b*b-(4*a*c);
	}
	public static String toImproperFrac(int a, int b, int c){
		return"((a*c)+b)+/+ c";
	}
	public static String toFixedNum(int a, int b) { //check 31-38
		return (a/b)+"/";
	}
	public static String foil(int a, int b, int c, int d, String n) {
		return "(a*c)n +";
	}
	
}











