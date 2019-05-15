import java.util.*;
 
class sum { 
    
    

    static void find(int A[], int arr_size, int add) 
    {  
  
        int flag = 0;

        for (int i = 0; i < arr_size - 2; i++) { 
  	 for (int j = i + 1; j < arr_size - 1; j++) { 
            for (int k = j + 1; k < arr_size; k++) { 
                 if( A[i] + A[j] + A[k] == add )

                   {	
                    System.out.println("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]); 
                     flag = 1;		} 
                    } 
                }                   
         
                  
}        if (flag == 0)

         System.out.println("No Triplets found");
     }

    public static void main(String[] args) 
    { 
        sum obj = new sum();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int A[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            A[i] = s.nextInt();
        }
        
        int arr_size = A.length; 
        int add = 0;
        
        obj.find(A, arr_size, add); 
    } 
} 
