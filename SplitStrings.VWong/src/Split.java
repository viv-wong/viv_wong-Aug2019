/* Vivian Wong
 * 21 October 2019
 * Period 4
 * A project in which we create a method that splits at a specific place and returns what is in the middle 
 * of that split code
 */

import java.util.Arrays; 

public class Split {
		 public static void main(String[] args) {

// Your task Part 0
		
		//String.split();

		//It's a method that acts on a string, <StringName>.split(<sp>);
		//Where sp is the string where the string splits
		//And it returns an array of Strings
		// Example: "I like apples!".split(" ");
		// it will split at spaces and return an array of ["I","like","apples!"]
			String[]outputArray1= "I like apples!".split(" ");
				System.out.println(Arrays.toString(outputArray1));

		// Example 2: "I really like really red apples!".split("really")
		// it will split at the word "really" and return an array of ["I "," like ","red apples!"]
			String[]outputArray2="I really like really red apples!".split("really");
			 	System.out.println(Arrays.toString(outputArray2));
		//play around with String.split!
			 String[]outputArray4="Really I really like really red apples".split("really") ;
				System.out.println(Arrays.toString(outputArray4));
			 	
		//What happens if you "I reallyreally likeapples".split("really") ?
			String[]outputArray3="I reallyreally likeapples".split("really") ;
				System.out.println(Arrays.toString(outputArray3));
			
			
		System.out.println(Split.part2("apples pineapples bread lettuce tomato bacon mayo ham bread cheese")); //testing out parts 1&2
		System.out.println(Split.part1("applespineapplesbreadlettucetomatobaconmayohambreadcheese"));
		 }
		

//Your task Part 1:
		 	/*Write a method that take in a string like

			* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

			* describing a sandwich.

			* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of
			* lettuce, tomato, bacon, mayo, ham

			* the sandwich and ignores what's on the outside

			* What if it's a fancy sandwich with multiple pieces of bread?

			*/ 
		 public static String part1(String sandwich) {
			 String[]outputArray5= sandwich.split("bread") ; //use split to split the sandwich by "bread"
			if(outputArray5.length<=1) {					// conditional for non-sandwiches
				return "Not a sandwich :(";
			}
				int location = sandwich.indexOf("bread");	//find the location of "bread" using indexOf
				if (location>=0) {
					String remains = sandwich.substring(location+5); //"bread" has 5 letters so add five to the location
					location = remains.indexOf("bread"); //find the index of the 'remains'/middle of the "bread" statement
						if (location>=0) {
							return outputArray5[1]; //return the middle contents of the sandwich
						} else {
							return "Not a sandwich :(";	//include not sandwich comments 
						}
				} else {
				return "Not a sandwich :(";
				}
		 }	

		

		//Your task pt 2:

		/*Write a method that take in a string like

		* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

		* describing a sandwich

		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

		* the sandwich and ignores what's on the outside.

		* Again, what if it's a fancy sandwich with multiple pieces of bread?

		*/

		 public static String part2(String sandwich) {
			 String [] outputArray6= sandwich.split(" ");	//use split method to split at the spaces
			 String noSpace = "";							//create a string for 'noSpace'
			 for(int i=0; i<outputArray6.length; i++) {	//return middle, disregard the outside contents
				 noSpace += outputArray6[i]; 			//update noSpace
			 }
			 return part1(noSpace);				//recall the method of part1 to get the final middle contents
		 }
}

		
		


