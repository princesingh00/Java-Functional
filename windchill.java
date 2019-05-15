import java.util.*;
import java.util.Scanner;
import java.lang.Math;

  public class windchill {

    public static void main(String[] args){
		
	System.out.println("Enter Temperature : ");
	Scanner obj = new Scanner(System.in);
	double t = obj.nextInt();
        
         System.out.println("Enter Speed : ");
         double v = obj.nextInt();

     if(t>50 || v<3 || v>120)
  {
         System.out.println("Enter Temperature less than 50 and speed in range 3 to 120 ");
  }

     else
   {    
         double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
         System.out.println("weather report : "+ w);
      
   }
       
   				}

		}
