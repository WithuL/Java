public class HomeWork11 {
	
	public static void main(String[] args) {
		for(int i = 1;i < 10; i++) {
			int sum = 0;
			for(int j=1;j <= i;j++) {
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
	}
}