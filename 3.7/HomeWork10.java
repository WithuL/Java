import java.util.Scanner;
public class HomeWork10 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int count = 0;
		while(a!=0) {
			if((a & 1) != 0) {
				count++;
			}
			a >>>= 1;
		}
		System.out.println("二进制的个数为:"+count);
	}
}