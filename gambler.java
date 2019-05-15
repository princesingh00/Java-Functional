import java.util.Scanner;
import java.lang.Math;

public class gambler{
public static void main(String[] args)
{
System.out.println("Enter your goal");
Scanner obj1 = new Scanner(System.in);
int goal = obj1.nextInt();

System.out.println("Enter cash");
Scanner obj2 = new Scanner(System.in);
int cash = obj2.nextInt();

System.out.println("Number of times");
Scanner obj3 = new Scanner(System.in);
int times = obj3.nextInt();
int loss =0;
int win= 0;

if(goal>cash)
{
 	
for(int i=0; i<times; i++)
{
 if(Math.random()<0.5 )
{
if(cash !=0){
    loss++;
    --cash;
}
else{
System.out.println("you are out of money");
break;
}
}


else
{
if(cash == goal)
{
    System.out.println("your goal achieved");
}
else{
    win++;
    cash++;
}

}
}
System.out.println("win : "+ win);
System.out.println("loss : "+ loss);
System.out.println("cash : "+ cash);
}



else
{
System.out.println("goal is low");
}
}}
 




