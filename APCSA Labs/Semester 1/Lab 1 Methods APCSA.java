import java.lang.*;
class Untitled {
	public static void main(String[] args) {
		int x = 8;
		int y = 9;
		int x1 = 8;
		int y1 = 9;
		int x2 = 2;
		int y2 = 4;
		System.out.println("The average of " + x + " and " + y + " is " + average(x,y));
		System.out.println("The slope of the line between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + slope(x1,y1,x2,y2));
		System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance(x1,y1,x2,y2) );
		//System.out.println("The distance between (" + x1 + ", " + y1 + " and (" + x2 + ", " + y2 + ") is " + Math.sqrt((square(difference(x1, x2))) + (square(difference(y1, y2)))));
		//double distance = Math.sqrt((square(difference(x1, x2))) + (square(difference(y1, y2))));
		//System.out.println(distance);
	}
	public static double average(int x, int y){
		return ((double)x+(double)y)/2; //instead of type casting, divide by 2.0 to change the value to double
	}
	public static double slope(int x1, int y1, int x2, int y2){
		//return ((double)y2-(double)y1)/((double)x2-(double)x1);
		return (double)difference(y2, y1) / (double)difference(x2, x1); //returns the slope using difference method
	}
	public static int difference(int x, int y){
		return x-y; //returns x-y
	}
	public static int square(int x)
	{
		return x*x; //returns x squared
	}
	public static double distance(int x1, int y1, int x2, int y2){
		//return Math.sqrt((x1-x2) * (x1-x2)+(y1-y2) * (y1-y2));
		return Math.sqrt((square(difference(x1, x2))) + (square(difference(y1, y2)))); //returns distance using math sqrt, square method and difference method
	}

}