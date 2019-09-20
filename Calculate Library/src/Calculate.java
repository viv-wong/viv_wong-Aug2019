/* Vivian Wong
 * August 29, 2019
 * Period 4
 * Group of methods that perform math calculations (a library)
 */

 //Part 1

	//returns the square of the value passed
public class Calculate { 
	public static int square(int number) {
		int answer=number*number;  
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
		double answer1=(b*b);
		double answer2=(4*a*c);
		return answer1-answer2;
	}
	//converts mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator){
		if (denominator==0) {
			throw new IllegalArgumentException("cannot have a denominator of zero");
		}
		if (whole<0) {
			throw new IllegalArgumentException("cannot have a zero whole number");
		}
		int answer= (whole*denominator)+ numerator;
		return answer + "/" + denominator;
	}
	//converts an improper fraction into a mixed number
		public static String toMixedNum(int numerator, int denominator) { 
			if (denominator==0) {
				throw new IllegalArgumentException("cannot have a denominator of zero");
			}
			int whole=numerator/denominator;
			int newnumerator=numerator%denominator;
			return whole + "_"+ newnumerator + "/" + denominator ;
		}
		//converts a binomial multiplication form into a quadratic equation form
		public static String foil(int a, int b, int c, int d, String x) {
			int answer1=a*c;
			int sum=(a*d)+(b*c);
			int answer4=b*d;
			return answer1+x+"^2 "+" + "+sum+x+" + "+answer4;
		}
		
	//Part Two
		//determines whether or not one integer is evenly divisible by another
		public static boolean isDivisibleBy(int a, int b) {
			if (b==0) {
				throw new IllegalArgumentException("cannot divide zeros");
			}
			if (a%b==0) {
			return true;
			} else {
			return false;
			}
		}
		//returns the absolute value of the number passed
		public static double absvalue(double a) {
			if (a<0) {
			return -a;
			} else {
			return a;
			}
		}
		//returns the larger of the values passed
		public static double max(double x,double y) {
			if (x>y) {
				return x;
			} else {
			 return y;
			}
		}
		//overload of the max method; returns the larger of the 3 values passed
		public static double max(double a, double b, double c) {
			if (a>b && a>c){
				return a;
			} else if (b>a && b>c){
				return b;
			} else if (c>a && c>b){
			}	return c;
			}

		//returns the smaller of the values passed
		public static int min(int x, int y) {
			if (x<y) {
				return x;
			} else {
				return y;
			}
		}
		//rounds a double correctly to 2 decimal places
		public static double round2(double x) {
			double num1=(100*x)+0.5;
			num1=(int)num1;
			double answer=num1/100;
			return answer;
			}
		
			
	//Part 3
		//raises a value to a positive integer power
		public static double exponent(double base, int exponent) {
			if (exponent<0) {
				throw new IllegalArgumentException("cannot have negative exponents");
			}
			int num=1;
			while (exponent != 0) {
				   num *= base;
				   --exponent;
				  }
			return num;
		}
		
		//returns the factorial of the value passed
		public static int factorial(int x) {
			if (x<0) {
				throw new IllegalArgumentException("cannot factor negatives");
			}
			int num=1;
			for(int i = 1; i <= x; i++){
	            num = num * i; 
		}
			return num;
		}
		//determines whether or not an integer is prime
		public static boolean isPrime(int x) {
			
			
			boolean num1=isDivisibleBy(a,b);
			
				}
			
		
		
		
		
		
		//finds the greatest common factor of two integers
		public static int gcf(int x, int y) {
			if (x<0||y<0) {
				throw new IllegalArgumentException("cannot have negative numbers as an input");
			}
			boolean num1=isDivisibleBy(a,b);
			int a;
			int b; 
		}
		//returns an approximation of the square root of the value passed, rounded to two decimal places
		public static double sqrt(double x) {
			
		}
	//Part 4
		//uses the coefficients of a quadratic equation in standard form
		//and uses the formula to approximate the real roots
		public static string quadForm(int a, int b, int c) {
			double dis= discriminant(a,b,c); 
			double root1;
			double root2;
		}
}

		











