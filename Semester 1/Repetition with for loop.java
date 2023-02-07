class Untitled {
	public static void main(String[] args) {
		System.out.println("Homer says: ");
		for(int i=1; i<=10; i++){
			System.out.println("All work and no play makes Josh a dull boy");
		}
		System.out.println("S-M-R-T... I MEAN S-M-A-R-T");
		System.out.println("==============");
		for(int i=1; i<=6; i++){
			System.out.println(i + " squared = " + i*i);
		}
		System.out.println("==============");
		for(int i=5; i<=25; i+=4){
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("==============");
		
		int sum=0;
		
		for(int i=1; i<=100; i++){
			sum +=i;
		}
		System.out.println(sum);
		
		int sum2=0;
		int x=1;
		
		while(x<=100){
			sum2+=x;
			x++;
		}
		System.out.println(sum2);
	}
}