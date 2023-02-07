class Untitled {
	public static void main(String[] args) {
		int[][] array = {{1,2,3,4,5}, {6,7,8,9,10}};
		for(int i = 0; i<20; i++){
			System.out.println("Is " + i + " in the array: " + search2D(array, i));
		}
		
	}
	public static boolean sequentialSearch(int[] array, int target){
		boolean value = false;
		for(int num : array){
			if(num == target){
					value = true;
			}
		}
		return value;
	}
	public static boolean search2D(int[][] array, int target){
		for(int row=0; row<array.length; row++){
			if(sequentialSearch(array[row], target)){
				return true;
			}
		}
		return false;
	}
}