/* Vivian Wong
 * 21 October 2019
 * Period 4
 * 
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
			
				
		//System.out.println(part1("bread"));
		//System.out.println(part1)
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
			 String[]outputArray5= sandwich.split("bread") ;
				System.out.println(Arrays.toString(outputArray5));
				int start= outputArray5.indexOf("bread");
				int end= outputArray5.lastIndexOf("bread");
				return "";
			}
		

		//Your task pt 2:

		/*Write a method that take in a string like

		* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

		* describing a sandwich

		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

		* the sandwich and ignores what's on the outside.

		* Again, what if it's a fancy sandwich with multiple pieces of bread?

		*/

		 }

		



