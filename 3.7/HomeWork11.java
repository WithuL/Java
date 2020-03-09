import java.util.Scanner;
public class HomeWork11 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1;i <= n; i++) {
			int sum = 0;
			for(int j=1;j <= i;j++) {
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
	}
}