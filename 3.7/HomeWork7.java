import java.lang.Math;
public class HomeWork7 {
	
	public static void main(String[] args) {
		for(int i = 0;i < 1000;i++) {
			int tmp = i;
			int count = 0;
			while(tmp !=0 ) {
				count++;
				tmp=tmp/10;
			}
			tmp = i;
			int sum = 0;
			while(tmp != 0) {
				sum += Math.pow(tmp%10,count); 
				tmp=tmp/10;
			}
			if(i == sum) {
				System.out.println(i);
			}
		}
	}
}