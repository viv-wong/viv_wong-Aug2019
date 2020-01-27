/*Vivian Wong
 * 6 December, 2019
 * Period 4
 * FracCalc project; create a calculator that computes fractions and returns a reduced mixed fraction
 */



package oldfracCalc2;

import java.util.*;

public class OldFracCalc2 {
	
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);	//create a scanner to get user input
        System.out.println("Welcome to Fraction Calculator!");	//welcome message
    	String operation = "";	//declare string variable to use in the loop
    	while(operation!="quit") {	//make a while loop to continue looping if their input does not equal "quit"
    		System.out.println("Please input what you would like to calculate: "); //ask for fraction equation
        	operation = userInput.nextLine();	//make operation equal to the next line of input
        	System.out.println(produceAnswer(operation));	//prints result returned by produceanswer
    	}
    	System.out.print("Thank you for using me! Have a nice day :)");	//goodbye message
    	userInput.close();	//close the scanner
    }

    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    public static String produceAnswer(String input) { 
    	String[] array = input.split(" ");	//create an array that will store the 3 split string outputs(split on spaces)	
        String firstOperand = array[0];		//create a variable that will store the firstoperand
        String operator = array[1];		//create a variable that will store the secondoperand
        String secondOperand = array[2];	//create a variable that will store the thirdoperand
        int[] finalAnswer = new int [3];	//create a new array that stores 3 values and will also serve to store the final answer
        
        int operand1Whole= findWhole(firstOperand);	//use findwhole method to find the whole # and store in variable
        int operand1Num= findNumerator(firstOperand);	//use findnumerator method to get the num of first frac
        int operand1Denom= findDenominator(firstOperand);	//use finddenominator method to find denom of first frac
        int[] op1Fraction = toImproperFrac(operand1Whole, operand1Num, operand1Denom);	//make a new int array to store 
        
        int operand2Whole= findWhole(secondOperand);	//use findwhole method to find the whole # and store in variable for the 2nd fraction
        int operand2Num= findNumerator(secondOperand);	//use findnumerator method to find num of 2nd operand
        int operand2Denom= findDenominator(secondOperand);	//use find denominator method to find the denom of the 2nd operand
        int[] op2Fraction = toImproperFrac(operand2Whole, operand2Num, operand2Denom);	//make a new int array to store the improper frac of operand 2
        
        String result="";	//make a string variable that will be used when returning the result
        if(operator.equals("+")) {	//make a conditional that checks if the operator is +
        	addingFrac(op1Fraction, op2Fraction, finalAnswer);	//if it is use the addingfrac method with op1fraction, op2, and the final answer to get the sum
        	result = toMixedNum(finalAnswer[1], finalAnswer[2]);	//convert the sum into a mixed number using the tomixednumber method; set = to result
        	
        } else if(operator.equals("-")) {	//also test if operator is -
        		subFrac(op1Fraction, op2Fraction, finalAnswer);	//if so use subfrac method to get the difference (use op1frac, op2 frac, and final answer
        		result = toMixedNum(finalAnswer[1], finalAnswer[2]);	//convert diff into mixed number set = to result
        		
        	} else if(operator.equals("*")) {	//also test if operator is *
        			multiplyFrac(op1Fraction, op2Fraction, finalAnswer);	//if so use multiply frac to get the product 
        			result = toMixedNum(finalAnswer[1], finalAnswer[2]);	//convert to mixed number set = to result
        			
        		} else if(operator.equals("/")) {	//also check if operator is /
        				divideFrac(op1Fraction, op2Fraction, finalAnswer);	//if so use dividefrac method to get the quotient
        				result = toMixedNum(finalAnswer[1], finalAnswer[2]);	//convert to mixed number set = to result
        					
        			}
    	return result;		//return result
        		}
        	
      
    // TODO: Fill in the space below with any helper methods that you think you will need
    
    public static int findWhole(String fraction) {	//method to find the whole #
    	if(fraction.contains("_")) {	//check if the fraction has an _
    		int whole= Integer.parseInt(fraction.substring(0, fraction.indexOf("_"))); //if so use substring to get num from index 0 to the _ ; set as a variable
    		return whole;	//return the number; use parseint to convert answer to an int
    	} else {
    		if(fraction.contains("/")) { //else if it contains a /
    			return 0;	//just return a 0
    		} 
    		return Integer.parseInt(fraction); //if it doesnt match any of conditionals then its probably just a whole num so just return it; convert to int
    	}		
    } 

    public static int findNumerator(String fraction) {	//method to find the num
    	if(fraction.contains("_")) {	//check if the frac has an _
    		int numerator= Integer.parseInt(fraction.substring(fraction.indexOf("_") +1, fraction.indexOf("/")));	//if so use substring from _ to the /; convert to int ant make variable for numerator
    		return numerator;	//return the numerator
    	} else {
    		if(fraction.contains("/")) {	//check if the frac just had a /
    			int numeratorSlash= Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));	//use substring to get numbers from index 0 to / ; make variable and convert to int
    			return numeratorSlash;	//return the number
    		} 
    	}
    	return 0;	//else if it doesnt apply to any of the conditionals above it's most likely a whole number so just return 0
    }

    
    public static int findDenominator(String fraction) {	//method to find the denom
    	if(fraction.contains("/")) {	//check to see if it has a /
    		int denominator= Integer.parseInt(fraction.substring(fraction.indexOf("/")+1,fraction.length( )));	//use substring to get numbers from / to the frac length; make variable
    		return denominator;	//return the number
    	} else {
    		return 1; //else if it's a whole number return 1
    	}
    }
    public static int[] toImproperFrac(int whole, int numerator, int denominator){ //method to make frac improper
    	if(whole<0) {	//check for negatives
    		numerator*=-1;	//if it is neg multiply by -1 to make it positive
    	}
    	int newNum = (whole*denominator) + numerator;	//to get the newnum multiply whole and denominator then add num
		int [] improperFracAnswer = {0, newNum, denominator};	//make new int array that stores the improperfracanswer: 0, newnum, denom
		return improperFracAnswer; 	//return the array
    }
    
    public static String toMixedNum(int numerator, int denominator) { 	//method to make frac a mixed number
    	int whole=numerator/denominator;		//make variable to store whole number by dividing num and denom
		int newnumerator=numerator%denominator;	//get newnum by doing num mod denom
		
		if(whole<0) {			//if whole number is negative and the new num is neg as well,
			newnumerator *= -1;	// make the new num positive
		}
		if(newnumerator==0 && whole==0) {	//if the frac is 0 all-around
			return "0";						//return 0
		}
		if(newnumerator==0) {	//if the num is 0 it's most likely
			return whole + "";	//just a whole number
		}
		if(newnumerator<0 && denominator<0) {	//if the num and denom is both neg
			newnumerator *= -1;					//then the frac itself should be negative
			denominator *= -1;
		}
		if(denominator<0) {				//if denom is negative 
			newnumerator *= -1;			//multiply both num and denom by -1 to get a postitive denom and neg num
			denominator *= -1;
		}
		if(whole==0) {			//if the whole num is 0
			return simplify(newnumerator, denominator);	//then it should just return num/denom
		}
		return whole + "_"+ simplify(newnumerator, denominator); //return statement of the whole mixed frac
    }

    
    public static void addingFrac(int[] op1, int[] op2, int[] finalAnswer) {	//create a method to add fracs together, takes in 3 arrays, void
    	finalAnswer[1] = (op1[1]*op2[2])+(op2[1]*op1[2]);	//make index 1 of finalanswer rep the numerator and multiply both num by the others denom then add together both products
    	finalAnswer[2] = (op1[2]*op2[2]);	//multiply both denom to get new denom, set equal to index 2 of finalanswer
}
    public static void subFrac(int[] op1, int[] op2, int[] finalAnswer) {	//create a method to sub fracs, takes in 3 arrays, void
    	finalAnswer[1] = (op1[1]*op2[2]) - (op2[1]*op1[2]);	//follow same format as add frac but now subtract the two products set equal to index 1 of finalanswer
    	finalAnswer[2] = (op1[2]*op2[2]);	//find denom by multiplying both denom together set equal to index 2 finalanswer
    }
    public static void multiplyFrac(int[] op1, int[] op2, int[] finalAnswer) {	//create a method to multiply fracs, takes in 3 arrays, void
    	finalAnswer[1] = (op1[1]*op2[1]);	//multiply both num to get the new num, store in index 1 of finalanswer
    	finalAnswer[2] = (op1[2]*op2[2]);	//multiply both denom together to get the new denom; store in index 2 of final answer
    }
    public static void divideFrac(int[] op1, int[] op2, int[] finalAnswer) {	//create a method to divide fracs, takes in 3 arrays, void
    	finalAnswer[1] = (op1[1]*op2[2]);	//multiply frac 1 num and frac 2 denom to get new num; store in index 1 of finalanswer
    	finalAnswer[2] = (op1[2]*op2[1]);	//multiply frac 1 denom and frac 2 num to get new denom; store in index 2 of final answer
    }
    public static String simplify(int numerator, int denominator) {	//a method that simplifies the frac
    	int result = gcf(numerator, denominator);	//use gcf to get the result and store it in an int variable
    	int newNum = numerator/result;		//make newnum equal to num/result
    	int newDenom = denominator/result;		//new denom equals denom/result
    	return newNum + "/" + newDenom;			//return statement of num / newdenom
    }
    public static boolean isDivisibleBy(int j, int i) {	//tests to see if two numbers are divisible
		if (j%i==0) { //use mod to achieve no remainder--meaning completely divisible
		return true;	//return true
		} else {
		return false;	//return false
		}
	}
    public static int gcf(int num, int denom) {	//method that finds the gcf
    	int number=1;	//declare num to equal 1	
		if(denom<0) { //if denom is negative, multiply by -1 to get a positive denom
			denom *= -1;
		}
		if(num<0) {	//if the num is negative multiply it by -1 to make it positive
			num *= -1;
		}
		for(int i = 1; i <= num && i <= denom; i++) {	//make a for loop that will test to see if i <=x&y (iterate to lowest # possible) to find the gcd
			if (isDivisibleBy(num,i) == true && isDivisibleBy(denom,i)==true) { 	// add 1 to i each loop; uses the method to check if i is factor of both integers
				number = i;	//make num equal to i
			}	
		}
		return number; //return the number
	}	
}


