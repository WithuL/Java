public class March96 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		double c = 1;
		double d = 1.2;
		double e = 2 ;
		System.out.println(add(a,b));
		System.out.println(add(c,d,e));
	}
	public static int add( int a, int b) {
		return a+b ;
	}
	public static double add( double c, double d, double e) {
		return c + d + e;
	}
}