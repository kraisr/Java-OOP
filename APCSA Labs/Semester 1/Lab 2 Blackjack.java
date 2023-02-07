class Untitled {
	public static void main(String[] args) {
		System.out.println(lucky(2,9));
		System.out.println(lucky(3,4));
		System.out.println(lucky(3,10));
		System.out.println(lucky(10,3));
		System.out.println(lucky(-4,11));
		System.out.println("============");
		System.out.println(mult35(3));
		System.out.println(mult35(5));
		System.out.println(mult35(15)); 
		System.out.println(mult35(17)); 
		System.out.println("============");
		System.out.println(blackjack(21,20));
		System.out.println(blackjack(21,21));
		System.out.println(blackjack(22,20));
		System.out.println(blackjack(21,22));
		System.out.println(blackjack(22,22));
		System.out.println(enoughBricks(21));
	}
	public static boolean lucky(int x, int y){
		return x == 7 || y == 7 || x + y == 7 || x - y == 7;
	}
	public static boolean mult35(int x){
		if(x > 0){
			if(x%3==0 && x%5==0){
				return false;
			}
			else if(x%3==0 || x%5==0){
				return true;
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static int blackjack(int x, int y){
		if(x<=21 && y<x){
			return 1;
		}
		else if(x>21 && y>21){
			return 0;
		}
		else if(x>21 && y<=21){
			return 2;
		}
		else if(x<=21 && y>21){
			return 1;
		}
		else if(x<y && y<=21){
			return 2;
		}
		return 14;
	}
	public static boolean possB(int x){
		return true;
	}
	public static String enoughBricks(int l){
		int bigB = l/5;
		int smallB = (l%5)/1;
		return "Big bricks: " + bigB + " small bricks: " + smallB + " " + possB(l);
	}
}