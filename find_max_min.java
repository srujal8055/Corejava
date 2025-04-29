package array;

public class find_max_min {
	public find_max_min() {
	 int arr[]= {23,12,344,3221,2514};
	 int max=arr[0];
	 for(int i=0;i<arr.length;i++) {
		 if (arr[i]<max)
		 {
			 max=arr[i];
			}
	 }
	 System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new find_max_min();
	}

}
