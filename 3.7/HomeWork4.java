import java.lang.Math;
import java.util.Scanner;
public class HomeWork4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i;
		for(i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				break;
			}
		}
		if(i>Math.sqrt(n)) {
			System.out.println(n+"是素数");
		}else {
			System.out.println("不是素数");
		}
	}
}