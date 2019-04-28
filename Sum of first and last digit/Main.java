import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
	    // Type your code here
      int n1=n;
      int first_digit=0;
      while(n1>=10)
      {
        n1=n1/10; 
        first_digit=n1;
      }
      
      int last_digit = n%10;
      int sum = first_digit + last_digit;
      System.out.println(sum);
	}
}