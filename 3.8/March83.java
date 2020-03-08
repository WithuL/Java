public class March83 {
	
	public static void main(String[] args) {
		int n=6846516;
		System.out.println(n);
		prt(n);
	}
	public static void prt(int n) {
		if(n == 0) {
			return;
		}else {
			prt(n / 10);
			System.out.print(n%10+" ");
		}
	}
}