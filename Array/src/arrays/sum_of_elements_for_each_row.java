package arrays;

public class sum_of_elements_for_each_row {

	public static void main(String[] args) {
		int[][] arr = { 
				{1,2,3},
				{4,5,6}
		};
		for (int i = 0; i < arr.length; i++) { 
            int sum = 0; 
            for (int j = 0; j < arr[i].length; j++) { 
                sum += arr[i][j]; 
            } 
            System.out.println("Row " + (i + 1) + " sum = " + sum); 
        } 
    }
		
		
	}
