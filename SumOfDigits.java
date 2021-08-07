package week1.day1classassignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=6789,rem;
		int sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum Of the Digits is:"+sum);

	}

}
