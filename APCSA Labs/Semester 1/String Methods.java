class Untitled {
	public static void main(String[] args) {
		System.out.println("/ \\ // \\\\ /// \\\\\\ //// \\\\\\\\");
		String name = "aloha";
		System.out.println(name.substring(1,3)); //shows char with index 1 to char with index 3 excluding 3
		
		String str1 = new String("123456789"); //Strings are objects
		String str2 = "12345";
		System.out.println(str1.compareTo(str2)); //substracts num of char in str1 from str2
		System.out.println(str2.compareTo(str1));
		
		String name1 = "Bob";
		String name2 = "bob";
		if(name1.equalsIgnoreCase(name2)){ //Should compare Strings with equals method not ==
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		if(name1.equals(name2)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		String book = "Building Java Programs";
		System.out.println(book.substring(9,13));
		
		String a = "hello";
		String b = "Hello";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase("hello"));
		
		//immutable
		String s = "Kendrick";
		s = "Snoop dog";
		System.out.println(s.substring(0,5));
	}
}