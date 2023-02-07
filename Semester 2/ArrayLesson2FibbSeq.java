import java.util.*;
class Untitled {
	public static void main(String[] args) {
		//1,1,2,3,5,8,13,21
		Scanner scan = new Scanner(System.in);
		int counter = scan.nextInt();
		int[] fib = new int[counter];
		fib[0] = 1;
		fib[1] = 1;
		for(int i=2; i<counter; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		System.out.println(counter + " Fibonacci numbers: ");
		for(int i=0; i<counter; i++){
			System.out.print(fib[i] + " ");
		}
	}
	public static int checkDivTwo(int[] arr){
		int count = 0;
		for(int nums : arr){
			if(nums%2==0){
				count++;
			}
		}
		return count;
	}
}