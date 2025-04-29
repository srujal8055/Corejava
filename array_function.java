package array;

public class array_function {
	int arr_fun(int arr[]) {
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			System.out.println(arr[i]);
		}
		return max;
			
	}
	
	
	
public static void main(String[] args) {
  array_function arr=new array_function();
  int arr1[]= {12,23,5,1,4,236};
	System.out.println(arr.arr_fun(arr1));
}
}
