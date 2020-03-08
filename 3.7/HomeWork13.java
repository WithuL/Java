import java.util.Scanner;
public class HomeWork13 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		while(a != 0) { 
			System.out.print(a%10+" ");
			a = a/10;
		}
	}
}