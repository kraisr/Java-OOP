class Untitled {
	public static void main(String[] args) {
		printLadder(4);
		System.out.println("");
		System.out.println("Min moves: " + minMoves(6));
		multiplicationTable(2);
		System.out.println("");
		multiplicationTable(4);
		pattern(5);
		pattern(7);
	}
	public static void printLadder(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print("1");
			}
			System.out.println("");
		}
	}
	public static int minMoves(int n){
		return (int) Math.pow(2,n)-1;
	}
	public static void multiplicationTable(int n){
		for(int i=1; i<=n; i++){
			System.out.println(" ");
			for(int g=1; g<=10; g++){
				System.out.print(g*i + "\t");
			}
		}
	}
	public static void pattern(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=n; i>0; i--){
			for(int j=i; j>0; j--){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}