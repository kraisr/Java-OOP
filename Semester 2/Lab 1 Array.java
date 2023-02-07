class Untitled {
	public static void main(String[] args) {
		int counter = 20;
		int[] arrayTest = new int[counter];
		int[] arrayTest2 = new int[counter];
		for(int i=0; i<counter; i++){
			arrayTest[i] = i+1;
			System.out.println(arrayTest[i]);
		}
		System.out.println(average(arrayTest));
		System.out.println(countAboveAve(arrayTest));
		System.out.println(largest(arrayTest));
		System.out.println(indexOfSmallest(arrayTest));
		
	}
	public static double average(int[] array){
		double ave = 0;
		for(double nums : array){
			ave += nums;
		}
		ave /= array.length;
		return ave;
	}
	public static int countAboveAve(int[] array){
		int count = 0;
		for(int nums : array){
			if(nums > average(array)){
				count++;
			}
		}
		return count;
	}
	public static int largest(int[] array){
		int lar = array[0];
		int counter = 0;
		for(int nums : array){
			if(nums > array[counter]){
				lar = nums;
			}
		}
		return lar;
	}
	public static int indexOfSmallest(int[] array){
		int small = array[0];
		for(int i=0; i<array.length; i++){
			if(array[i]<small){
				small = i;
			}
		}
		return small;
	}
}