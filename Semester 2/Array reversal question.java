import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int[] a1 = new int[6];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a1.length; i++){
			a1[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(arrayReverse(a1)));
	}
	
	public static int[] arrayReverse(int[] array){
		int[] reverseArray = new int[array.length];
		for(int i=0; i<array.length; i++){
			reverseArray[i] = array[array.length-i-1];
		}
		return reverseArray;
	}
	
}