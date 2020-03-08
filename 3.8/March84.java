public class March84 {
	
	public static void main(String[] args) {
		int n=9874;
		System.out.println(sum(n));
	}
	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}else {
			return n%10+sum(n/10);
		}
	}
}