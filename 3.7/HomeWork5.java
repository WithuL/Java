import java.util.Scanner;
public class HomeWork5 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n <= 18) {
			System.out.println("是少年");
		}else if(n <= 28) {
			System.out.println("是青年");
		}else if(n <= 55) {
			System.out.println("是中年");
		}else  {
			System.out.println("是老年");
		}		
	}
}