import java.util.Random;
import java.util.Scanner;
public class HomeWork6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		
		int rand = random.nextInt(100);
		
		while(true) {
			System.out.println("请输入你猜的数字：");
			int n = scan.nextInt();
			if(n == rand) {
				System.out.println("恭喜你，猜对了！");
				break;
			}
			if(n < rand) {
				System.out.println("小了");
			}
			if(n > rand) {
				System.out.println("大了");
			}
		}
	}
}