import java.util.*;
import java.util.concurrent.TimeUnit;

public class stopwatch

{
	public static void main(String[] args){
             	
		Scanner x = new Scanner(System.in);
                  System.out.println("press '1' and Enter ");
		int start =  x.nextInt();

		long startTime = System.nanoTime();

		System.out.println("press '0' and Enter ");
		int end =  x.nextInt();

		long endTime = System.nanoTime();

		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds  : " + timeElapsed);

		System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);
	}
}
