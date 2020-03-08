//1-10的和
public class March82 {
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(sum(n));
	}
	
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n+sum(n-1);
		}
	}
}