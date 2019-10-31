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
		double answer1=(b*b); 	//'square' b and then subtract 4ac from the product
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
			int whole=numerator/denominator;		//the whole # is num/denom
			int newnumerator=numerator%denominator;	//then do num mod denom to get the new num
			return whole + "_"+ newnumerator + "/" + denominator ; //then assemble
		}
		//converts a binomial multiplication form into a quadratic equation form
		public static String foil(int a, int b, int c, int d, String x) { //general form of (n-#)(n-#)
			int answer1=a*c;	// first multiply n and n to get the first part of the string (raise to the ^2)
			int sum=(a*d)+(b*c);	//then multiply both n's and #'s together to get second part (#n)
			int answer4=b*d;			//then multiply #'s together in order to get third part
			return answer1+x+"^2 "+"+ "+sum+x+" + "+answer4; //raise ans1 to ^2, add plus signs between each part.
		}
		
	//Part Two
		//determines whether or not one integer is evenly divisible by another
		public static boolean isDivisibleBy(int a, int b) {
			if (b==0) {
				throw new IllegalArgumentException("cannot divide zeros");
			}
			if (a%b==0) { //use mod to achieve no remainder--meaning completely divisible
			return true;
			} else {
			return false;
			}
		}
		//returns the absolute value of the number passed
		public static double absValue(double a) {
			if (a<0) {	//test for negatives
			return -a;	//use '-' to get a positive from the negative
			} else {
			return a; //if not negative but greater than 0, return the orig input
			}
		}
		//returns the larger of the values passed
		public static double max(double x,double y) {
			if (x<0) {			//checking for negatives; giving back non-negative numbers
				return y;
			} else if(y<0) {
				return x;
			}
			if (x>y) {		//test to see which value is larger
				return x;
			} else {		//return the largest value
			 return y;
			}
		}
		//overload of the max method; returns the larger of the 3 values passed
		public static double max(double a, double b, double c) {
			if (a<0 && b>c ||c<0 && b>a) { 
			//if (b==a) {
				return b;					
			} else if (b<0 && a>c|| c<0 && a>b) {
				//if (c==a) {
				return a;
			} else if (a<0 && c>b || b<0 && c>a) {
				//if (b==c) {
				return c;
		}
			
			if (a>b && a>c){		//test if a is greater than both b&c
				return a;			//if so return a
			} else if (b>a && b>c){	//if not, test if b is > than a&c
				return b;			//if so return b
			} else if (c>a && c>b){ //if not, repeat and test c
			}return c;//if so return c
			}
			
		//returns the smaller of the values passed
		public static int min(int x, int y) {
			if (x<0) {
				return x;
			} else if (y<0){
				return y;
			}
			if (x<y) {		//test to see which value is smaller
				return x;
			} else {
				return y;	//return the smallest value
			}
		}
		//rounds a double correctly to 2 decimal places
		public static double round2(double x) {
			if(x<0) { //test for neg values
				double num1=(100*x)-0.5;	//multiply value by 100 to possible decimal points in the value back
				num1=(int)num1; 			//minus 0.5 to the product; next cast an int to num1 to make it a whole#
				double answer=num1/100;		//divide by 100 to get decimal point in the correctly rounded 2 places
				return answer;	
			}
			
			
			double num1=(100*x)+0.5;	//multiply value by 100 to possible decimal points in the value back
			num1=(int)num1; 			//add 0.5 to the product; next cast an int to num1 to make it a whole#
			double answer=num1/100;		//divide by 100 to get decimal point in the correctly rounded 2 places
			return answer;				//return answer
			}
		
			
	//Part 3
		//raises a value to a positive integer power
		public static double exponent(double base, int exponent) {
			if (exponent==0 && base==0) {
				throw new IllegalArgumentException("cannot have an exponent and base of zero");
			}
			if (exponent==0) {
				throw new IllegalArgumentException("cannot have an exponent of zero");
			}
			if (exponent<0) {
				throw new IllegalArgumentException("cannot have a negative exponent");
			}
			if (base==0) {
				throw new IllegalArgumentException("cannot have a base of zero");
			}
			
			int num=1;					//declare num to equal 1
			while (exponent != 0) { 	//then test if exp is not equal to 0
					 --exponent;		//subtract 1 from exp each loop
					 num *= base;		//once out of the loop, multiply num (1) & base to get the new num
				  }
			return num;					//return the answer (num)
		}
		
		//returns the factorial of the value passed
		public static int factorial(int x) {
			if (x<0) {
				throw new IllegalArgumentException("cannot factor negatives");
			}
			int num=1;						//declare num to equal 1
			for(int i = 1; i <= x; i++){	//enter for loop-- int i=1; test if i is <= x
	            num = num * i; 				//add 1 
		}									//once out of loop, multiply num with i to get new num
			return num;						//return answer
		}
		//determines whether or not an integer is prime
		public static boolean isPrime(int x) {
			int num=2;			//declare num to equal 2--b/c any # is divisible by 1
			while(x%num!=0) {	//test if x mod num is not equal to 0
				num++;			//add 1 to num each loop
			}
			boolean num2=isDivisibleBy(num,x); //once out of loop, input x and new num into method isDivisibleBy
			if(num2==true) {		//set method equal to variable num2--in the method: num%x==0?
				return true;		//if num2 is true, return true, if not return false
			} else {				//note: test for 25, 9, 49, etc to make sure
				return false;		
			}
			}
			
		//finds the greatest common factor of two integers
		public static int gcf(int x, int y) {
			if (x<0||y<0) {
				throw new IllegalArgumentException("cannot have negative numbers as an input");
			}
			if (x==0) {
				return y;
			} else if (y==0) {
				return x;
			}
			
			int num=1;															//declare num to equal 1							
			for(int i = 1; i <= x && i <= y; i++) {								//test to see if i <=x&y (iterate to lowest # possible) to find the gcd
				if (isDivisibleBy(x,i) == true && isDivisibleBy(y,i)==true) { 	// add 1 to i each loop; uses the method to check if i is factor of both integers
					num = i;						
				}
			}																	//store the value in num
			return num; 														//return num
			
			
		}
		//returns an approximation of the square root of the value passed, rounded to two decimal places
		public static double sqrt(double x) {
			if (x<0) {
				throw new IllegalArgumentException("cannot have a negative input");
			}
			if (x==1) {
				return x;
			}
			double guess=0.0123*x;	//use guess and check to find an educated guess 
			double answer=0.5*((x/guess) + guess); //input into Newton's method to get an answer
				double last=round2(answer);		//round the answer to 2 decimal places
					return last;
			}
	//Part 4
		//uses the coefficients of a quadratic equation in standard form
		//and uses the formula to approximate the real roots
		public static String quadForm(int a, int b, int c) {
			String output="";					//declare variables
			double dis= discriminant(a,b,c);  //find discriminant
				if (dis<0) {					//negative roots if dis<0 so no real roots
					output= "no real roots";
					
				} else if(dis==0) {				//if dis=0 they have the same root 
					double root1=(-b+ sqrt(dis))/(2*a); //find the root 		
					double rootFinal1=round2(root1);	//round the root to 2 decimal places
						output= rootFinal1 + "";
						
				} else if(dis>0) { 				//if dis>0 there are 2 real roots
					 double root3=(-b + sqrt(dis))/(2*a); //subtract and add the discriminant to find the roots
					 double root2=(-b - sqrt(dis))/(2*a);
					 double rootFinal3=round2(root3);
					 double rootFinal2=round2(root2);
						if (rootFinal3>rootFinal2) {					//use if/else to put smaller root in front
							output= rootFinal2 + " and " + rootFinal3;
						} else {
							output= rootFinal3 + " and " + rootFinal2;
						}	
						}
			return output; 	//return the output
				}
				}
				
		


		











