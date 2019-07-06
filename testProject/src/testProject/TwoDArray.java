package testProject;

public class TwoDArray {
	
	//Jagged Array is uneven array of the 2d array it works exactly the same as 2D array.

	public static void main(String[] args) {

		int [][] myArray = {
				{2,45,6,3},
				{45,32,12,31},
				{65,7,55,89}
				};
		//System.out.println(myArray.length);  //prints the number of rows
		
		for(int i = 0; i<myArray.length; i++) {
			for(int k =0; k<myArray[i].length; k++) {      //this will get the column length
				System.out.print(myArray[i][k]+ "   ");
			}
			System.out.println();
		}

			int sum =0;
			for(int c =0; c<myArray.length; c++) {
				for(int r = 0; r<myArray[c].length; r++) {
					sum = sum + myArray[c][r];
					
				}
				
			}
			System.out.println("The Sum is: " + sum);
	

	}

}
