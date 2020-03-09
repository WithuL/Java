import java.util.Scanner;
public class March93 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
		int n = scan.nextInt();
		System.out.println( factorial( n ) );
	}
	public static int factorial( int n ) {
		int sum = 1;
		for ( int i = 1 ; i <= n ; i++ ) {
			sum *= i;
		}
		return sum;
	}
}