
package array;
import java.util.Scanner;
public class array_userdefine {
	public array_userdefine() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter array size");
		int n=scn.nextInt();
		int average=0;
		int sum = 0;
		int number=0;
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter element");
			arr[i]=scn.nextInt();
		}
		//display
		for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		 // Loop to calculate sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate average
        average = (double) sum / numbers.length;

        // Print result
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new array_userdefine();
	}

}
