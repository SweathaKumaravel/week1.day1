package week1.day1assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0, num2=1, sum, total=8;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<total;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
			
			
		}
		

	}

}
