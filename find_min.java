package array;

public class find_min {
	public find_min() {
		int arr[]= {122,336,365,245,47,58,545};
		int min=arr[0];
		for(int i=0;i<
				arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new find_min();
	}

}
