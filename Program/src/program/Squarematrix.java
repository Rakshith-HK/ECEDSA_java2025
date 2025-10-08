package program;

public class Squarematrix {
	public static void main(String[] args) {
		//declaring matrix
		int[][] matrix = { 
						{1, 2, 3 ,4},
						{4, 5, 6, 5 },
						{7, 8, 9, 5},
						{2, 1, 4, 1}
						} ;
		
		// intialising the sum 
		int sum = 0;
		
		//adding only diagonal elements
		for (int i = 0; i < matrix.length; i++)
		{
			sum = sum + matrix[i][i];
			// can also be writed as
			// sum += matrix[i][i];
		}
		System.out.println("sum of diagonal elements is : "+sum);
	}
}
