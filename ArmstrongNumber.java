package week1.day1assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int remainder,original,result=0 ;
		 original = num;
		while(original > 0) {
			remainder=original % 10;
			original= original/10;
			result= (remainder*remainder*remainder) + result;
		
		}
		if(result == num)
			System.out.println(num + "is an Armstrong Number");
		else
			System.out.println(num + "is not an Armstrong Number");
		
			
		

	}

}
