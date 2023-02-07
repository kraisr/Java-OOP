class Untitled {
	public static void main(String[] args) {
		printTwoDigit(7);
	}
	public static void printTwoDigit(int n){
		int x;
		int isTrue = 0;
		for(int i=0; i<n; i++){
			x = (int)(Math.random() * (19-10+1) + 10);
			System.out.println("next = " + x);
			if(x==13)
			{
				isTrue +=1;
			}
		}
		if(isTrue!=0){
			System.out.println("we saw a 13!");
		}
		else{
			System.out.println("no 13 was seen.");
		}
	}
}