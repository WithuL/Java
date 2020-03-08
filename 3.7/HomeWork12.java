import java.util.Scanner;
public class HomeWork12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int passWord = 123456;
		for(int i = 1;i <= 3;i++) {
			System.out.println("请输入您的密码：");
			int n=scan.nextInt();
			if(n == passWord) {
				System.out.println("登陆成功！");
			}else if (i == 3) {
				System.out.println("输入错误，您的输入次数已达上限！");
			}else if (n != passWord) {
				System.out.println("输入错误，您还有"+(3-i)+"次机会");
			}
		}
	}
}