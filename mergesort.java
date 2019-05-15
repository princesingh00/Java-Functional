import java.util.*;

public class mergesort {

    public static void main(String[] args)
  {   
      mergesort ob = new mergesort();
      Scanner x = new Scanner(System.in);
      System.out.println("Enter the size of array for sorting : ");
      int n = x.nextInt();

      int[] arr = new int[n];
      System.out.println("Enter the array elements : ");
      for(int i=0; i<n ;i++){
         arr[i] = x.nextInt();
      } 
    
        ob.mergeSort(arr,0,n-1);
        ob.print(arr,n);
}


   static void merges(int[] array, int l, int m, int r)
   {  
      int i, j, k;
      int n1 = m-l+1;
      int n2 = r-m;
       
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        
	for (i = 0; i < n1; i++) 
         {  L[i] = array[l + i]; }
         for (j = 0; j < n2; j++) 
         {  R[j] = array[m + 1+ j]; }

        i = 0;
        j = 0;
        k = l;

    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            array[k] = L[i]; 
            i++; 
        } 
        else
        { 
            array[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
      while (i < n1) 
      { 
        array[k] = L[i]; 
        i++; 
        k++; 
      } 
      
    
      while (j < n2) 
      { 
        array[k] = R[j]; 
        j++; 
        k++; 
     } 
} 
  


  	void mergeSort(int arr[], int l, int r) 
	{ 
	    if (l < r) 
	    { 
       
 	       int m = l+(r-l)/2; 
 
 	       mergeSort(arr, l, m); 
 	       mergeSort(arr, m+1, r); 
  
 	       merges(arr, l, m, r); 
 	   } 
	} 
       
	void print(int array[], int len)
	{
     		System.out.println("Sorted array : ");
     		 for(int i=0; i<len ;i++){
     		 System.out.print(array[i]+ " ");
      		}
		System.out.println();

	}
}
