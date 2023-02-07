class Untitled {
	public static void main(String[] args) {
		int num = 27;
		System.out.println(countFactors(num));
		System.out.println(isPrime(num));
		//System.out.println(countPrimes(num));		//not working
	}
	public static int countFactors(int x){
		int num=0;
		for(int i=1; i<=x; i++){
			if(x%i==0){
				num += 1;
			}
		}
		return num;
	}
	public static boolean isPrime(int x){
		return (countFactors(x)==2);
		//return x<=3 && x>=1 || x%2!=0 && x%3!=0;
		/*if(x>3){
			boolean prime = x%2!=0 && x%3!=0;
			System.out.println(prime);
		}
		else if(x<=3 && x>=1){
			boolean prime = x%2!=0 && x%3!=0;
			System.out.println(prime);
		}*/
	}
	public static int countPrimes(int x){
		int i=0;
		int iter = 2;
		while(iter<=x){
			if(isPrime(iter)){
				i++;
				//System.out.println(i);
			}
		iter++;
		}
		return i;
	}
}