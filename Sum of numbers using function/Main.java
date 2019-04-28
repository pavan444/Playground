import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int sum=0;
    for(int i=1; i<=n;i++)
    {
     sum=sum+i;
      
    }
    System.out.println(sum);
    
   return 0; 
  }
  
  
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s;
      s=sum(n);
	}
}