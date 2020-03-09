import java.util.Scanner;
public class March92 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
		int n = scan.nextInt();
		System.out.println( factorial( n ) );
	}
	public static int factorial( int n ) {
		int sum = 0;
		for ( int i = 1 ; i <= n ; i++ ) {
			int tmp = 1;
			for ( int j= 1 ; j <= i ; j++ ) {
				tmp *= j ;
			}
			sum = sum + tmp ;  
		}
		return sum;
	}
}