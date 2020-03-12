public class March121 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		exchArr(arr);
	}
	public static void exchArr(int[] arr) {
		int p = 0;
		int tmp = 0 ;
		int q = arr.length-1;
		while(p < q) {
			while( ( (arr[p] & 1) != 0 ) && (p < q)  ) {
				p++;
			}
			while( ((arr[q] & 1) == 0)&& (p < q) ) {
				q--;
			}
			if( ((arr[p] & 1) == 0) && ((arr[q] & 1) != 0) ) {
				tmp = arr[p];
				arr[p] = arr[q];
				arr[q] = tmp;
			}
		}
		for (int x : arr) {
			System.out.println(x);
		}
	}
}