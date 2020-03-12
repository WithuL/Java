public class March123 {
	
	public static void main (String[] args) {
		int a1 = 1;
		int a2 = 2;
		double b1 = 1.1;
		double b2 = 2.2;
		System.out.println(max(a1,a2));
		System.out.println(max(b1,b2));
		System.out.println(max(b1,b2,a1));
	}
	
	public static int max (int a,int b) {
		return a>b?a:b;
	}
	public static double max (double a,double b) {
		return a>b?a:b;
	}
	public static double max (double a,double b,int c) {
		return (max(a,b))>c?(max(a,b)):c;
	}
}