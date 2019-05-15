import java.util.Scanner;

public class first
{
public static void main(String[] args)
{
Scanner a = new Scanner(System.in);

System.out.println("enter your name : ");

String name = a.nextLine();

int len = name.length();

    if(len >= 3){
		System.out.println("Hello " + name + ", How are you?");
		}
	
	
		
	else{	
		System.out.println("INVALID USERNAME");

	}


   }
}
