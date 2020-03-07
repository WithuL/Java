public class HomeWork8 {
	
	public static void main(String[] args) {
		int flag = 1;
		double sum = 0;
		for(int i = 1;i <= 100;i++) {
			sum+=1.0/(flag*i);
			flag *= -1;
		}
		System.out.println(sum);
	}
}