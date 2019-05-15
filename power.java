import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class power {
public static void main(String[] args){

System.out.println("Enter a number : ");
while(true){
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();

if(n>=0 && n<31){

for(int i =0; i<n; i++)
{
double x = Math.pow(2, i);
System.out.println("power "+ x);

}break;
}

else{
System.out.println("Enter a number in between 0 to 31");
}

}}}
