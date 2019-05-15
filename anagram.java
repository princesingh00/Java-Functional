import java.io.*; 
import java.util.Arrays; 
import java.util.Collections;

public class anagram{

 public static void main(String args[]) 
    { 
        //Scanner obj = new Svcanner;
        //System.out.println("Enter First String");
         
        char str1[] = { 't', 't', 'e', 's' };
        //System.out.println("Enter second String");
        char str2[] = { 't', 't', 'e', 's' }; 

         int n1 = str1.length;
	int n2 = str2.length;
	
	if(n1!=n2){
	 System.out.println("Given strings are not anagrams");
	}

	else{
	
	  Arrays.sort(str1); 
           Arrays.sort(str2); 
          

                 if(str1.equals(str2)) { 
                 System.out.println("Given strings are anagrams");
                 } 
		else {
                  System.out.println("Given strings are not anagrams");
                 }

 }
		
	         
	

}
}
