import java.util.Scanner;
public class March85 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a=0;
		int b=1;
		int sum=1;
		for(int i = 2;i <= n;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(sum);
	}
}