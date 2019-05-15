import java.util.Scanner;

public class factor{
public static void main(String[] args)
{
System.out.println("Enter the Number : ");
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();

for(int i=2; i<=n; i++)
{
while(n%i==0)
{

System.out.println("Number : " + i);
n = n/i;

}

}}}
