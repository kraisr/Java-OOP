import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many days: ");
		int counter = scan.nextInt();
		int[] temperatures = new int[counter];
		
		for(int i=0; i<counter; i++){
			System.out.print("Day " + (i+1) + "'s high temp: ");
			temperatures[i] = scan.nextInt();
			System.out.println();
		}
		System.out.println("Average Temperature: " + average(temperatures));
		System.out.println(avgCounter(temperatures, average(temperatures)) + " days were above average");
		//int[] test = new int[10]; 	//array declaration
	}
	public static double average(int[] temp){
		int tot = 0;
		for(int nums : temp){
			tot =  nums;
		}
		return (double)tot / temp.length;
	}
	public static int avgCounter(int[] temp, double avg){
		int dayCount = 0;
		for(int num : temp){
			if(num>avg){
				dayCount++;
			}
		}
		return dayCount;
	}
}