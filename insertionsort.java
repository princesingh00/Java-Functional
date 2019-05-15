import java.util.*;

public class insertionsort {

    public static void main(String[] args)
  {   
      insertionsort ob = new insertionsort();
      Scanner x = new Scanner(System.in);
      System.out.println("Enter the size of array for sorting : ");
      int n = x.nextInt();

      int[] arr = new int[n];
      System.out.println("Enter the array elements : ");
      for(int i=0; i<n ;i++){
         arr[i] = x.nextInt();
      } 
    
        ob.insertion(arr,n);

}


   static void insertion(int[] array, int len)
   {  
      int temp = 0;
      int j = 0;
      for(int i=0; i<len ;i++){ 
       int key =array[i];
	 j = i-1;
           while(j>=0  && array[j]>key){
            array[j+1] = array[j];
              j = j-1;
	}
     array[j+1] = key;
}	

     System.out.println("Sorted array : ");
      for(int i=0; i<len ;i++){
      System.out.print(array[i]+ " ");
      
}System.out.println();


}}
