import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String something = "1 23 456 7890";
		String str1 = "racecar";
		System.out.println(removeSpaces(something));
		System.out.println(removeSpacesFor(something));
		System.out.println(palindrome(str1));
		
	}
	public static String removeSpaces(String str){
		while(str.indexOf(" ") != -1){
			int indexSpace = str.indexOf(" ");
			String first = str.substring(0, indexSpace);
			String second = str.substring(indexSpace+1);
			str = first + second;
		}
		return str;
	}
	public static String removeSpacesFor(String str){
		String emptyString = "";
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) != ' '){
				emptyString+=str.charAt(i);
			}
		}
		return emptyString;
	}
	public static boolean palindrome(String str){
		//racecar
		//0123456
		String newString = "";
		
		//assume str is two
		//              0123
		//str.len is 3
		//i starts as 3 
		//is i > 3
		
		for(int i = str.length()-1; i >= 0; i--){
			newString+=str.charAt(i);
		}
		
		System.out.println(newString);
		return (str.equals(newString));
	}
}