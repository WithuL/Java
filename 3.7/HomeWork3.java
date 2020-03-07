import java.lang.Math;
public class HomeWork3 {
	
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int j = 2;
			for(j=2;j <= Math.sqrt(i);j++) {
				if(i%j == 0) {
					break;
				}
			}
			if(j>Math.sqrt(i)){
				System.out.println(i);
			}
		}
	}
}