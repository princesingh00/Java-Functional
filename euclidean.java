import java.util.Scanner;
import java.lang.Math;

public class euclidean{



  static double calculate(int a, int b){
    double d1 = Math.pow(a,2);
    double d2 = Math.pow(b,2);
    double distance = Math.sqrt(d1 + d2);
 return distance;

} 

public static void main(String[] args)
{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the first number");
	int x = obj.nextInt();

	System.out.println("Enter the second number");
	int y = obj.nextInt();

         System.out.println();        
         System.out.println("DISTANCE : "+ calculate(x,y));
 
}


}
