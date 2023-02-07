import java.util.*;

class Untitled {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++){
			array.add(i+(int)(Math.random()*10));
		}
		System.out.println(array);
		
		int sum = 0;
		for(int num : array){
			sum += num;
		}
		System.out.println(sum);
		
		int posMax = 0;
		int max = Integer.MIN_VALUE;
		int posMin = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<array.size(); i++){
			if(array.get(i) > max){
				posMax = i;
				max = array.get(i);
			}
			if(array.get(i) < min){
				posMin = i;
				min = array.get(i);
			}
		}
		System.out.println("Largest number: " + max + " at position: " + posMax);
		System.out.println("Lowest number: " + min + " at position: " + posMin);
		
	}
}