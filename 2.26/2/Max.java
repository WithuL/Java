public class Max{
	public static void main(String[] args){
		int a=0;
		int b=2;
		int c=4;
		if(a<b){
			int tmp=a;
			a=b;
			b=tmp;
		}
		if(a<c){
			int tmp=a;
			a=c;
			c=tmp;
		}
		if(b<c){
			int tmp=b;
			b=c;
			c=tmp;
		}
		System.out.println("最大的数是："+a);
	}
}