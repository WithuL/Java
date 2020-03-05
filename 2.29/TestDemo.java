public class TestDemo{ 
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;//sum = sum+i;
			i++;
		}
		System.out.println(sum);
		i=1;
		sum=0;
		while(i<=100){
			if(i%2==0){
				sum+=i;
				i+=2;
			}
		}
		System.out.println(sum);
		i=1;
		sum=0;
		while(i<=100){
			if(i%2!=0){
				sum+=i;
				i+=2;
			}
		}
		System.out.println(sum);
	}
}