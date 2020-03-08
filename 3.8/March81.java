//求阶乘
import java.util.Scanner;
public class March81{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = factorial(n);
		System.out.println(sum);
	}
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}