import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class coupon{

 public static int getcoupon(int n) {
  System.out.println(Math.random());
 	return (int)(Math.random()*n);


}

	public static int collect(int n) {
		boolean[] a = new boolean[n];
		int count = 0;
		int distinct = 0;


	while(distinct < n) {
	int value = getcoupon(n);
	count++;
	if (!a[value]){
	distinct++;
	a[value] = true;
		}  
}
   return count;
}

	public static void main(String[] args) {

		System.out.println("enter the number : ");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int count = collect(n);
		System.out.println(count);

				            }
  		}








