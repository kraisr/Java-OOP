import java.util.Arrays;
//import java.sql.*;

class Untitled {
	public static void main(String[] args) {
		int[][] mat = {{3,4,5},{1,2,3}};
		int[][] matrix = {{3,4,6}, {1,2}, {6,1,-3,5}};
		
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		//.length is num of rows
		//.size() is num col
		
		System.out.println("===Traversing with two for loops===");
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		System.out.println("===Traversing with for and for each loop===");
		
		for(int[] row : matrix){
			for(int num : row){
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		System.out.println("===Traversing array in column major order===");
		
		for(int col=0; col<mat[0].length; col++){
			for(int row=0; row < mat.length; row++){
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("===Printing array using method===");
		
		for(int i=0; i<matrix.length; i++){
			printArray(matrix[i]);
		}
		
		System.out.println("===Printing sum of array using method===");
		
		System.out.println(sumOfArray(matrix));
		
		System.out.println("===Printing sum of sixes in array using method===");
		
		System.out.println(sumOfSixesArray(matrix));
		
	}
	
	public static void printArray(int[] array){
		System.out.println(Arrays.toString(array));
	}
	
	public static int sumOfArray(int[][] array){
		int sum = 0;
		for(int[] row : array){
			for(int num : row){
				sum += num;
			}
		}
		return sum;
	}
	
	public static int sumOfSixesArray(int[][] array){
		int sum = 0;
		for(int[] row : array){
			for(int num : row){
				if(num == 6)
					sum += num;
			}
		}
		return sum;
	}
	
}
