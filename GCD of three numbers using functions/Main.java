import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    int gcd=0,min;
    if(a<b)
      min=a;
    else
      min=b;
    while((a % min == 0) && ( b % min == 0))
          {
            gcd = min;
              break;
          }
          min--;
    
    return gcd;
    
  }
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      
      int res=gcd(a,b);
      int final_result=gcd(res,c);
      System.out.println(final_result);
                         
	
	}
}