class Untitled {
	public static void main(String[] args) {
		System.out.println(longestStreak("Mississipi", "si"));
	}
	public static int longestStreak(String string1, String string2){
		String temp = string1;
		int position = 0;
		int result = 0;
		while(temp.indexOf(string2)>=0){

			position = temp.indexOf(string2);
			result++;
			temp = temp.substring(position+1);
		}
		return result;
	}
}