package week1.day1assignments;

public class PrimeNumber {

	public static void main(String[] args) {
      int input=13;
      boolean flag=false;
      for(int i=13;i<=input;i++) {
    	  if(input % i==0 ) {
    		  flag = true;
    		  break;
    	  }
      }
    		  if(flag = true) 
    		  System.out.println(input + "is a Prime Number");
    		  else
    			  System.out.println(input + "is not a Prime Number");
    		  
      }
      


	}


