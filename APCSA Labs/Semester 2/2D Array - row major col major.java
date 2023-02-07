class Untitled {
	public static void main(String[] args) {
		int[][] rec = {	{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20}};
		System.out.println("=====Row major=====");
		for(int i=0; i<rec.length; i++){
			for(int j=0; j<rec[i].length; j++){
				System.out.print(rec[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("=====Col major=====");
		
		for(int i=0; i<rec[0].length; i++){
			for(int j=0; j<rec.length; j++){
				System.out.print(rec[j][i] + ", ");
			}
			System.out.println();
		}
		
		
		System.out.println("=====Largest Number=====");
		int lar = Integer.MIN_VALUE;
		for(int i=0; i<rec.length; i++){
			for(int j=0; j<rec[i].length; j++){
				if(rec[i][j] > lar){
					lar = rec[i][j];
				}
			}
		}
		System.out.println(lar);
		
		System.out.println("=====Sum and avg=====");
		double sum = 0;
		int counter = 0;
		for(int[] row : rec){
			for(int val : row){
				sum += val;
				counter++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/counter);
	}
}