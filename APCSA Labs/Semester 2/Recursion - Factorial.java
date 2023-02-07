class Untitled {
	public static void main(String[] args) {
		//Factorial - the product of all the numbers below and including the chosen number
		//3! = 3 * 2 * 1
		System.out.println(calcFactorial(3));
		System.out.println(sumOfNumbers(10));
		System.out.println(fibNumbers(7));
		
	}
	public static int calcFactorial(int x){
		//Create statement to check exit condition
		if(x==1){
			return 1; //send exit value
		}else{
			return (x * calcFactorial(x-1));
		}
	}
	public static int sumOfNumbers(int n){
		if(n==0){
			return 0;
		}
		else{
			return (n+sumOfNumbers(n-1));
		}
	}
	public static long fibNumbers(long n){
		if(n<=1){
			return n;
		}
		else{
			return (fibNumbers(n-1) + fibNumbers(n-2));
		}
	}
}

//1) calcFactorial(6) ---- how many times is calcFactorial invoked? 6
//2) Write a recursive mmathematical definition for computing 1 + 2 + 3 + ... + n for a positive integer n.
//3) Write a recursive method to print fibonnacci sequence up to the number given as an argument. Fibonnacci is: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...