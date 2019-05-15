import java.util.Scanner;
import java.util.*;
public class leap
{
public static void main(String[] args)
{
Scanner a = new Scanner(System.in);
System.out.println("Enter the Year in 4 digit : ");
int year = a.nextInt();

if(year%4 == 0)
{
System.out.println("Leap Year : "+ year);
}
else{
System.out.println("Not Leap Year : "+ year);
}

}}
