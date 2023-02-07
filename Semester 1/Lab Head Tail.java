import java.lang.*;
class Untitled {
	public static void main(String[] args) {
		fourHeads();
	}
	public static void fourHeads(){
		int count = 0;
		int num;
		while(count<4){
			num = (int)(Math.random()*2);
			//System.out.print(num);
			if(num==0){
				System.out.print("H");
				count++;
			}
			else{
				System.out.print("T");
				count=0;
			}
		}
		System.out.println("");
		System.out.println("Finally! 4 in a row!");
	}
}