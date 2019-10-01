//Vivian Wong
//September 30, 2019
//Actual code for Quadratic Describer 
//responsible for all calculations

public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		//use quadDescriber, sqrt, discriminant, quad.form, round2
	//String output= "";
	String description="";
		//describing the quadratic form of the graph
				description= "\nDescription of the graph of: \ny= " + (a+"x^2"+" + "+b+"x"+" + "+c);
				
		//finding the orientation of the graph; up or down	
			if (a<0) {
				description += "\nOpens: Down"; //print out string
			} else {
				description += "\nOpens: Up";
		}
		//finding the vertex
			double h=(-b)/2*a; //first find h value
			 if(b<0||b==0) {
				 h=(+b)/2*a; //verify that a neg and neg equals a positive, as does a zero
			 }
			double k= a*(h*h)+b*h+c; //subs to find k value
				description+= "\nVertex: "+"("+h+","+k+")"; //print out value
				
		//finding the axis of symmetry -- vertex's h
				description+= "\nAxis of Symmetry: " + h;	 //print out h
	return description;
	}
	
	//finding the intercepts of x
	public static String xIntercepts(double a, double b, double c) {
		String output="";					//declare variables
		double dis= discriminant(a,b,c);  //find discriminant
			if (dis<0) {					//negative roots if dis<0 so no real roots
				output= "x-intercept(s): no x-intercepts :(";
				
			} else if(dis==0) {				//if dis=0 they have the same root 
				double root1=(-b+sqrt(dis))/(2*a); //find the root 		
				double rootFinal1=round2(root1);	//round the root to 2 decimal places
					output= "x-intercept(s): "+"("+ rootFinal1 + ", "+"0.0"+")";
					
			} else if(dis>0) { 				//if dis>0 there are 2 real roots
				 double root3=(-b+sqrt(dis))/(2*a); //subtract and add the discriminant to find the roots
				 double root2=(-b-sqrt(dis))/(2*a);
					output= "x-intercept(s): "+ "("+ root2 + ", "+"0.0"+")"+ " & "+ "("+ root3 + ", "+"0"+")";
			}
			
		return output;
	}
	
	//finding y intercept -- just c
		public static String yIntercept(double a, double b, double c) {
			String output="";
			output= "y-intercept: "+ c;
			return output;
		}
			
				
	
//small calculate library for above/necessary calculations in the 2nd method specifically
public static double discriminant(double a, double b, double c) {
	double answer1=(b*b); 	//'square' b and then subtract 4ac from the product
	double answer2=(4*a*c);
	return answer1-answer2;
}
public static double sqrt(double x) {
	double guess=0.15*x;	//use guess and check to find an educated guess 
	double answer=0.5*(x/guess + guess); //input into Newton's method to get an answer
		double last=round2(answer);		//round the answer to 2 decimal places
			return last;
	}
public static double round2(double x) {
	double num1=(100*x)+0.5;	//multiply value by 100 to possible decimal points in the value back
	num1=(int)num1; 			//add 0.5 to the product; next cast an int to num1 to make it a whole#
	double answer=num1/100;		//divide by 100 to get decimal point in the correctly rounded 2 places
	return answer;				//return answer
	}
}
			
	

