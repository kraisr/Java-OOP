import java.util.*;
class Untitled {
	public static void main(String[] args) {
		String[] words = new String[8];
		words[0] = "ten";
		words[1] = "fading";
		words[2] = "post";
		words[3] = "card";
		words[4] = "thunder";
		words[5] = "hinge";
		words[6] = "trailing";
		words[7] = "batting";
		for (String keyword: words) {if (keyword.lastIndexOf("ing") == keyword.length() - 3) {System.out.println(keyword);}}
}
}