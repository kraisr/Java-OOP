import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		pigLatin(name);
	}
	
	public static void pigLatin(String usrInput){
		System.out.println(usrInput.substring(1) + usrInput.substring(0,1) + "ay");
	}
}