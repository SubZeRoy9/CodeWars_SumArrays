import java.util.Scanner;

public class SumArray {
	public static void main(String[] args) {
		System.out.println("Enter an array of numbers");
		double[] ar = {3, 43, 5.6, 2, 1};
		System.out.println(sum(ar));
		
	}
	  public static double sum(double[] numbers) {
		    double num = 0;
		    
		    for (int i = 0; i < numbers.length; i++) {
		      num += numbers[i];
		    }
		    return num;
		  }

}
