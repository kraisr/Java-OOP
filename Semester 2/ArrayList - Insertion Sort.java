import java.util.*;
class Untitled {
	public static void main(String[] args) {
		ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();
		for(int i=1; i<=20; i++){
			arrayOfNumbers.add(i*(int)(Math.random()*10+1));
			//System.out.println(i*(int)(Math.random()*10+1));
		}
		System.out.println(arrayOfNumbers);
		
		System.out.println(insertionSort(arrayOfNumbers));
		System.out.println(insertionSortLargest(arrayOfNumbers));
	}
	
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> array){
		for(int i=0; i<array.size(); i++){
			for(int j=i; j<array.size(); j++){
				if(array.get(i)>array.get(j)){
					int temp = 0;
					int smallest = array.get(j);
					temp = array.get(i);
					array.set(i, smallest);
					array.set(j, temp);
				}
			}
		}
		return array;
	}
	public static ArrayList<Integer> insertionSortLargest(ArrayList<Integer> array){
		for(int i=0; i<array.size(); i++){
			for(int j=i; j<array.size(); j++){
				if(array.get(i)<array.get(j)){
					int largest = array.get(j);
					int temp = array.get(i);
					array.set(i, largest);
					array.set(j, temp);
				}
			}
		}
		return array;
	}
	
}