import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		System.out.println("The midpoint between (" + x1 + ","+ y1 + ") and (" + x2 + "," + y2 + ") is " + "(" + midpoint(x1, x2) + "," + midpoint(y1, y2) + ")");
		System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance(x1,y1,x2,y2));
	}
	
	public static double midpoint(int x1, int y1){
		return average(x1,y1);
	}
	public static double average(int x, int y){
		return ((double)x+(double)y)/2; //instead of type casting, divide by 2.0 to change the value to double
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