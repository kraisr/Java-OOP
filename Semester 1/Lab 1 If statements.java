class Untitled {
	public static void main(String[] args) {
		System.out.println(dayOfWeek(10,15,2020));
	}
	public static String dayOfWeek(int m, int d, int y){
		int y0 = y-(14-m)/12;
		int x0 = y0+y0/4-y0/100+y0/400;
		int m0 = m+12*((14-m)/12)-2;
		int d0 = (d+x0+31 * m0/12) % 7;
		String day = "";
		if(d0==0){
			day = "Sunday";
		}
		if(d0==1){
			day = "Monday";
		}
		if(d0==2){
			day = "Tuesday";
		}
		if(d0==3){
			day = "Wednesday";
		}
		if(d0==4){
			day = "Thursday";
		}
		if(d0==5){
			day = "Friday";
		}
		if(d0==6){
			day = "Saturday";
		}


		return day;
	}
}