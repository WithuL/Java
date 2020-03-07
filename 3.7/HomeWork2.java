public class HomeWork2{
	
	public static void main(String[] args) {
		for(int i=1000;i<=2000;i++) {
			if(i%4 == 0 && i%100!=0) {
				System.out.println("普通闰年："+i);
			}
			if(i%400==0){
				System.out.println("世纪闰年："+i);
			}
		}
	}
 }