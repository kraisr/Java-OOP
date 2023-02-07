import java.lang.Math;
class Untitled {
	public static void main(String[] args) {
		/*for(int i=0; i<100; i++){
			double rand = Math.random();
			System.out.println((int)(rand * 10 + 1));
		}*/
		
		int min = 50;
		int max = 100;
		int range = max - min + 1;
		for(int i=0; i<1; i++){	//change i<1 to i<100 to check the results
			double rand = Math.random();
			System.out.println((int)(Math.random() * range) + min);
			//random x range + min
		}
		System.out.println("==================");
		
		double squareRoot = Math.sqrt(121.0);
		System.out.println(squareRoot);
		int absoluteValue = Math.abs(-50);
		System.out.println(absoluteValue);
		System.out.println(Math.min(3, 7) + 2);
		
		System.out.println("==================");
		
		System.out.println(withinHalf(4, 5.1));
		System.out.println(withinHalf(3.4, 3.9));
		System.out.println(withinHalf(3.9, 3.4));
		System.out.println(withinHalf(-1.2, -1.1));
		
		System.out.println("==================");
		//prints random number from 7 to 15 as double
		System.out.print((Math.random() * (15-7+1)) + 7);
	}
	public static boolean withinHalf(double numOne, double numTwo){
		return Math.abs(numOne - numTwo) <= 0.5;
		/*if (Math.abs(numOne - numTwo) <= 0.5){
			return true;
		}else{
			return false;
		}*/
	}
}