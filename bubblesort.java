import java.util.*;

public class bubblesort {

    public static void main(String[] args)
  {   
      bubblesort ob = new bubblesort();
      Scanner x = new Scanner(System.in);
      System.out.println("Enter the size of array for sorting : ");
      int n = x.nextInt();

      int[] arr = new int[n];
      System.out.println("Enter the array elements : ");
      for(int i=0; i<n ;i++){
         arr[i] = x.nextInt();
      } 
    
        ob.sorting(arr,n);

}


   static void sorting(int[] array, int len)
   {  
      int temp = 0;
      for(int i=0; i<len-1 ;i++){ 
        for(int j= 0; j<len-i-1; j++){
           if(array[j]>array[j+1])
                {
		temp = array[j];
		array[j]=array[j+1];
                  array[j+1] = temp;
	}

	}

  }   System.out.println("Sorted array : ");
      for(int i=0; i<len ;i++){
      System.out.print(array[i]+ " ");
      
}System.out.println();


}}
