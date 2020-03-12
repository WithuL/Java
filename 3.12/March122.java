public class March122 {
	
	public static void main(String[] args) {
		int[] arr = {4,3,4,1,2,1,2};
		System.out.println(findX(arr));
	}
	
	public static int findX(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 1;i < arr.length-1;i++) {
			if((arr[i]!=arr[i-1])&&(arr[i]!=arr[i+1])) {
				return arr[i];
			}
		}
		if(arr[0]!=arr[1]) {
			return arr[0];
		}
		if(arr[arr.length-1]!=arr[arr.length-2]) {
			return arr[arr.length-1];
		}
		return 0;
	}
}