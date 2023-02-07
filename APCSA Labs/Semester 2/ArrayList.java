import java.util.ArrayList;
class Untitled {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("dumplings");
		words.add("game");
		words.add("notebooks");
		words.add("dumpling");
		words.add("car");
		words.add("ball");
		words.add("notebook");
		for(String word : words){
			if(word.substring(word.length()-2,word.length()-1).equals("s")){
				words.remove(word);
			}
		}
		System.out.println(words);
	}
}