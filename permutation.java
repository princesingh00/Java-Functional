import java.util.Scanner;
import java.util.*;

public class permutation 
{        
	
	static void permute(String str, int l, int r) 
	{ 
		if (l == r) 
			System.out.println(str); 
		else
		{ 
			for (int i = l; i <= r; i++) 
			{ 
				str = swap(str,l,i);  
				permute(str, l+1, r); 
				str = swap(str,l,i); 

			} 
		} 
	} 


	static String swap(String a, int i, int j) 
	{        
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp;
		return String.valueOf(charArray); 
	} 

	public static void main(String[] args) 
	{ 
		System.out.println("Enter your String"); 
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();

		int n = str.length(); 
		System.out.println(); 
		System.out.println("PERMUTATION"); 
		System.out.println(); 
		permute(str, 0, n-1); 
		
	} 

	
	

} 



