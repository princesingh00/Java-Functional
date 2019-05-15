import java.util.Scanner;
import java.lang.Math;
public class coin
{
 public static void main(String[] args)
{
int heads=0,tails = 0;
int num;
System.out.println("Number of times coin flipped : ");
while(true){
Scanner a = new Scanner(System.in);     			// scanner object
 num = a.nextInt();

if(num>0){					// head and tail initialization
	for(int i=0; i<num; i++)
	{
	 if(Math.random() < 0.5)					// random method
	{heads++;
		}
	else
	{
	tails++;
		}
	}
break;
}


else{
System.out.println("Enter a positive number : ");

}
	
	}

System.out.println("Number of heads : " + heads);
System.out.println("Number of tails : " + tails);


float h = ((heads*100)/num);
float t = ((tails*100)/num);

System.out.println("Heads percentage : " + h);
System.out.println("Tails percentage : " + t);

}

}
