import java.util.*;
import java.util.ArrayList;
import java.sql.*;

class Untitled {
	public static void main(String[] args) {
		int[] array = new int[7];
		array[0] = 5;
		array[1] = 9;
		array[2] = 8;
		array[3] = 1;
		array[4] = 3;
		array[5] = 4;
		array[0] = 2;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(7);
		arrayList.add(9);
		arrayList.add(0);
		
		selectionSort(array);
	}
	
	public static void selectionSort(int[] array){
		for(int i=0; i<array.length; i++){
			int min = array[i];
			int minIndex = i;
			for(int j=i; j<array.length; j++){
				if(min>array[j]){
					min = array[j];
					minIndex = j;
				}
			}
			if(minIndex != i){
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void insertionSort(ArrayList<Integer> array){
		for(int i=1; i<array.size(); i++){
			int key = array.get(i);
			for(int j=i-1; j >=0; i++){
				if(key<array.get(j)){
					array.set(j+1, array.get(j));
				}
				
				if(j==0){
					array.set(0,key);
				}
			}
			
		}
	}
}