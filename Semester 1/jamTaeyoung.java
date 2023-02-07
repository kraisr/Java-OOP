import java.util.*;

public class jamTaeyoung {
	static double smallest1 = 0.001;
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t > 0) {
			smallest1 = 0.001;
			int n = inp.nextInt();
			double[][] m = new double[n*n*n][2];
			double[][] arrn = new double[n][3];
			for(int i = 0; i <arrn.length; i++) {
				//do {
					arrn[i][0] = inp.nextDouble();
					arrn[i][1] = inp.nextDouble();
					arrn[i][2] = inp.nextDouble();
				//}while(Math.pow((-1*(arrn[i][0])), 2) + (Math.pow((-1*(arrn[i][1])), 2)) < arrn[i][2]);
			}
			//printArray(arrn);
			int count =0;
			for(int i = 0; i<arrn.length; i++) {
				for(int j = 1; j <arrn.length; j++) {
					//double a = ((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)));
					//double b = ((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1);
					//double c = (-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1]));
					//double d = (Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2));
					if(i < j && Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2) - 4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2)) == 0) {
						//System.out.println("its 0");
						//yl = (-((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))/(2*((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1))));
						//xl =  ((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))/(2*((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1)))*(2*arrn[j][1]-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0]));
						int nom = 0;
						for(nom = 0; nom < arrn.length; nom++) {
							if(Math.pow(((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))/(2*((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1)))*(2*arrn[j][1]-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0])) - (Math.pow(arrn[nom][0], 2)), 2) + Math.pow((-((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))/(2*((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1)))) - (Math.pow(arrn[nom][1], 2)), 2) < Math.pow(arrn[nom][2], 2)) {
								continue;
							}else {
								m[count][0] = ((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))/(2*((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1)))*(2*arrn[j][1]-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0]));
								m[count][1] = (-((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))/(2*((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1))));
								count++;
							}
						}
					}else if(i < j && Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2) - 4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2)) > 0){
						//System.out.println("its >0");
						//yl = ((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) + Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)));
						//yk = ((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) - Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)));
						//xl = ((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (-((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) + Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)))*(2*arrn[j][1] - 2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0]));
						//xk = ((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (-((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) - Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)))*(2*arrn[j][1] - 2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0]));
						for(int nom = 0; nom < arrn.length; nom++) {
							if(Math.pow(((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (-((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) + Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)))*(2*arrn[j][1] - 2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0])) - (Math.pow(arrn[nom][0], 2)), 2) + Math.pow(((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) + Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1))) - (Math.pow(arrn[nom][1], 2)), 2) >= Math.pow(arrn[nom][2], 2 ) ) {
								m[count][0] = ((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (-((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) + Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)))*(2*arrn[j][1] - 2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0]));
								System.out.println("m : [" + count + "][0] = " + m[count][0]);
								m[count][1] = ((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) + Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)));
								System.out.println("m : [" + count + "][1] = " + m[count][1]);
								count++;
							}else if(Math.pow(((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (-((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) - Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)))*(2*arrn[j][1] - 2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0])) - (Math.pow(arrn[nom][0], 2)), 2) + Math.pow(((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) - Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1))) - (Math.pow(arrn[nom][1], 2)), 2) >= Math.pow(arrn[nom][2], 2)){
								m[count][0] = ((Math.pow(arrn[i][2], 2) - Math.pow(arrn[i][0], 2) - Math.pow(arrn[i][1], 2) - Math.pow(arrn[j][2], 2) + Math.pow(arrn[i][0], 2) + Math.pow(arrn[j][1], 2) + (-((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) - Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)))*(2*arrn[j][1] - 2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][0]));
								System.out.println("m : [" + count + "][0] = " + m[count][0]);
								m[count][1] = ((-(-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])) - Math.sqrt(Math.pow((-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1])))/(2*arrn[j][0] - 2*arrn[i][1])), 2)-4*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)*(Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))))/(2*((Math.pow((2*arrn[j][1]+(-2*arrn[i][1]))/(2*arrn[j][0]+(-2*arrn[i][0])), 2)) + 1)));
								System.out.println("m : [" + count + "][1] = " + m[count][1]);
								count++;
							}else {
								continue;
							}
						}
					}
				}
			} 
			int q = 0;
			for(int i =0; i < m.length; i++) {
				for(int j =0; j< m[0].length; j++) {
					if(m[i][0] == 0 && m[i][1] == 0) {
						q = i;
						//System.out.println(q);
						break;
					}
				}
				if(q != 0) {
					break;
				}
			}
			double[][] mcopy = new double[q][m[0].length];
			for(int i =0, k =0; i <m.length; i++) {
				if(m[i][0] == 0 && m[i][1] == 0) {
					continue;					
					}
				for(int j =0; j < m[0].length; j++) {
					mcopy[k][j] = m[i][j];
				}
				k++;
			}
			m = mcopy;
			double[] zm = new double[m.length];
			for(int i =0; i <m.length; i++) {
				zm[i] = Math.sqrt(Math.pow(m[i][0], 2)+Math.pow(m[i][1], 2));
			} 
			System.out.println(Arrays.toString(zm));
			//printArray(m);
			smallest(zm);
			System.out.printf("%.3f \n", smallest1);
			t--;
		}
	}
	public static void printArray(double[][] arrn) {
		for(int i =0; i < arrn.length; i++) {
			for(int j = 0; j < arrn[0].length; j++) {
				System.out.print("{ " + arrn[i][j] + " }");
			}
			System.out.println();
		}
	}
	public static void smallest(double[] n) {
		for(int i =0; i<n.length; i++) {
			for(int j =0; j<n.length; j++) {
				if(i != j && n[i] > n[j]) {
				break;
				}else if(j == n.length -1 && i != j && n[i] < n[j]) {
					smallest1 = n[i];
				}else if(j == n.length -1 && i == n.length -1 && n[i] <= n[j -1]) {
					smallest1 = n[i];
				}
			}
		}
	}
}
//a = ((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))
//b = ((Math.pow((2*arrn[j][1]-2*arrn[i][1])/(2*arrn[j][0]-2*arrn[i][0]), 2)) + 1)
//c = (-2*arrn[i][1] - (2*((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))*((2*arrn[j][1])+(-2*arrn[i][1]))/(2*arrn[j][0] - 2*arrn[i][1])))
//d = (Math.pow(((Math.pow(arrn[i][2], 2)) - (Math.pow(arrn[i][0], 2)) - (Math.pow(arrn[i][1], 2)) - (Math.pow(arrn[j][2], 2)) + (Math.pow(arrn[j][0], 2)) + (Math.pow(arrn[j][1], 2)) + (-2*arrn[j][0]*arrn[i][0]) + (2*Math.pow(arrn[i][0], 2)))/(2*arrn[j][0] - 2*arrn[i][0]), 2) + Math.pow(arrn[i][1], 2) - Math.pow(arrn[i][2], 2))