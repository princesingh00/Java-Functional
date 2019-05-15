import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class twoD {

  	public static void main(String[] args)
{		Scanner obj = new Scanner(System.in);
                // PrintWriter x = new PrintWriter(System.out); 
		System.out.println("Enter the Number of rows : ");
			int row = obj.nextInt();

		System.out.println("Enter the Number of columns : ");
			int col = obj.nextInt();
         
	System.out.println("Enter the array elements : ");
		int i=0;
		int j=0;
		int[][] arr = new int[row][col];

         for(i=0; i<row; i++){

	 for(j=0; j<col; j++)
{
          arr[i][j] = obj.nextInt();
	 }
}
       System.out.println("your array ");

                 // x.println(arr);
	         //x.flush();

		for(i=0; i<row; i++){

	 	for(j=0; j<col; j++)
{          System.out.print( arr[i][j] + "\t" );
          	
	 }
       System.out.println();

 
 		




}

}}
