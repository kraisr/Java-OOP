class Circle{
	private int x;
	private int y;
	private double radius;
	public Circle(int newX, int newY, double newRadius){
		x = newX;
		y = newY;
		radius = newRadius;
	}
	public Circle(int x, int newX, int newY){
		x = newX;
		y = newY;
		radius = x*y;
	}
	public double getArea(){
		return x*y; 
	}
	public boolean isInCircle(int a, int b){
		return true;
	}
	public double translate(int dx, int dy){
		return x+y+radius;
	}
	public double tripleTheRadius(){
		return 3 * radius;
	}
}