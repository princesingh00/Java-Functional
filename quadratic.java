import java.util.Scanner;
import java.util.*;

public class quadratic {

public static void main(String[] args)

{ 	 
 
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter value for a: ");
	int a = obj.nextInt();
	System.out.println("Enter value for b: ");
	int b = obj.nextInt();
	System.out.println("Enter value for c: ");
	int c = obj.nextInt();

		double delta = (Math.pow(b,2) - 4*a*c);
		System.out.println("DISCRIMINANT " + delta);

         if(delta>0){

                  double root1 = (-b + Math.sqrt(delta))/(2*a);
	         double root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("ROOT 1 : " + root1);
			System.out.println("ROOT 2 : " + root2);
 		}
         else if(delta == 0){
                  double root3 = -b/2*a;
			System.out.println("ROOT  : " + root3);
			}
	else{
			System.out.println("EQUATION HAS NO REAL ROOTS");
	}
}}







