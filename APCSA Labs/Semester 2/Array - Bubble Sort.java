import java.util.*;
class Untitled {
	public static void main(String[] args) {
		int[] array = {5,8,9,6,7,4,3,1,2};
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(sort(array)));
	}
	
	public static int[] sort(int[] array){
		int temp = 0;
		for(int i=0; i<array.length-1; i++){
			for(int j=0; j<array.length-1-i; j++){
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}