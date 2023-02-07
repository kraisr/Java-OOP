class Untitled {
	public static void main(String[] args) {
		System.out.println(recur(27));
		whatsItDo("WATCH");
		String word = "WORD";
		System.out.println(word.length());
	}
	
	public static int recur(int n){
		if(n<=10)
			return n*2;
		else {
			return (recur(n/3));
		}
	}
	public static void whatsItDo(String str){
		int len = str.length();
		if(len>1){
			String temp = str.substring(0, len-1);
			whatsItDo(temp);
			System.out.println(temp);
		}
	}
}