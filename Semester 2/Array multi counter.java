class Untitled {
	public static void main(String[] args) {
		int number = 669260267;
		
	}
	public static int mostFrequentDigit(int num){
		String numb = Integer.toString(num);
		String[] array = new String[9];
		for(int i=0; i<9; i++){
			array[i] = numb.substring(i,i+1);
			
		}
	}
}