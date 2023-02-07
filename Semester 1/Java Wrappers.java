class Untitled {
	public static void main(String[] args) {
		//Integer i = new Integer(2);	//old way
		Integer j = 2;	//new way, declares as object Integer
		Double d = 3.5;
		//System.out.println(i);
		System.out.println(j.intValue());	//intValue() returns primitive value
		System.out.println(j);
		System.out.println(d.doubleValue());
		//two wrapper classes:
		//Integer class
		//Double class
		System.out.println("==================");
		
		String ageStr = "16";
		System.out.println("The age is " + ageStr + 10);	//takes ageStr as string
		System.out.println("The age is " + (Integer.parseInt(ageStr) + 10));	//parses string to int
		
		System.out.println("==================");
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE - 1);
		System.out.println(Integer.MAX_VALUE + 1);
		
		System.out.println("==================");
		
		Integer k = 2;	//wrapper, boxes the integer
		int number = k;	//unboxes the integer
		System.out.println(k);
	}
}