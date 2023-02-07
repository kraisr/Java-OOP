import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		printSeparated(name);
	}
	
	public static void printSeparated(String name){
		System.out.println("First: " + name.substring(0,name.indexOf(" ")));
		name = name.substring(name.indexOf(" ") + 1);	//moves the index +1 after space index 
		System.out.println("Middle: " + name.substring(0, name.indexOf(" ")));
		name = name.substring(name.indexOf(" ") + 1);	
		System.out.println("Last: " + name);
	}
}