import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Person 1 enter your weight in kg: ");
		double mass = scan.nextDouble();
		System.out.println("Person 1 enter your height in meters: ");
		double height = scan.nextDouble();
		double bmi = bmi(mass,height);
		
		System.out.println("Person 2 enter your weight in kg: ");
		double mass1 = scan.nextDouble();
		System.out.println("Person 2 enter your height in meters: ");
		double height1 = scan.nextDouble();
		double bmi1 = bmi(mass1,height1);
		System.out.println(bmi);
		System.out.println(bmi1);
		
	}
	public static double bmi(double mass, double height){
		return mass/(height*height);
	}
}