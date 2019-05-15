import java.util.Scanner;

public class harmonic{
public static void main(String[] args)
{
System.out.println("Enter the Number : ");
while(true){
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
if(n!=0){
float sum =0;

for(float i=1; i<=n; i++)
{
sum = sum + 1/i;

}
System.out.println("harmonic  : "+ sum);
break;
}
else{
System.out.println("Enter a number not equal to zero ");

}
}
}}
