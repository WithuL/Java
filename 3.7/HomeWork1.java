import java.util.Scanner;
public class HomeWork1{
	
	public static void main(String[] args){
		int count=0;
		for(int i=1;i<=100;i++){
			if(i%10 == 9 || i/10==9){
				count++;
			}
		}
		System.out.println("一共有"+count+"个9");
	}
}