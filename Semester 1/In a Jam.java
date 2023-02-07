import java.util.*;
import java.lang.*;
class Untitled {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		double yl = 0.0001;
		double xl = 0.0001;
		double[][] arrn = new double [n][3];		
		
		for(int i=0; i<arrn.length; i++){
			arrn[i][0] = inp.nextDouble();
			arrn[i][1] = inp.nextDouble();
			arrn[i][2] = inp.nextDouble();
		}
		for(int i=0; i<arrn.length; i++){
			for(int j=1; j<arrn.length; j++){
				/*if ((Math.pow(c,2)-(4*b*d))<0){
					continue;
				}else*/ 
				if(((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])))-(4*(Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]),2)+1)*((Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))==0){
					yl = (-((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))/(2*((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1))));
					xl = ((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))/(2*((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1)))*(2*arrn[j][1]-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0]));
					int nom = 0;
					if((Math.pow(xl - (Math.pow(arrn[nom][0], 2)), 2) + Math.pow(yl - (Math.pow(arrn[nom][1], 2)), 2) < Math.pow(arrn[nom][2], 2))){
						
					}
					
				
				}
			}
		}
	}
}