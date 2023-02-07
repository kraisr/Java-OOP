import java.util.*;
class Untitled {
	public static void main(String[] args) {
		int[] arrayTest = new int[5];
		arrayTest[0] = 132;
		arrayTest[1] = 212;
		arrayTest[2] = 1232132;
		arrayTest[3] = 21312;
		arrayTest[4] = 213212;
		System.out.println(arrayLargest(arrayTest));
		System.out.println(arrayAverage(arrayTest));
		System.out.println(allEven(arrayTest));
		System.out.println(Arrays.toString(arrayReverse(arrayTest)));
	}
	public static int arrayLargest(int[] array){
		int lar = array[0];
		for(int nums : array){
			if(nums > lar){
				lar = nums;
			}
		}
		return lar;
	}
	public static double arrayAverage(int[] array){
		double averageOfArray = 0;
		for(double nums : array){
			averageOfArray += nums;
		}
		return averageOfArray/array.length;
	}
	public static boolean allEven(int[] array){
		int count = 0;
		for(int nums : array){
			if(nums % 2 == 0){
				count++;
			}
		}
		if(count == array.length){
			return true;
		}
		else{
			return false;
		}
	}
	public static int[] arrayReverse(int[] array){
		int[] reverseArray = new int[array.length];
		for(int i=0; i<array.length; i++){
			reverseArray[i] = array[array.length-i-1];
		}
		return reverseArray;
	}
	public static String arraySwapEdges(int[] array){
		int[] newArray = new int[array.length];
		int temp;
		for(int i=0; i<array.length; i++){
			//newArray = array.length-i;
			
		}
		return null;
	}
}