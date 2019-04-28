import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int val;
    val=n*n;
    System.out.println(val);
    return 0; 
    
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s;
      s=square(n);
	} 
}