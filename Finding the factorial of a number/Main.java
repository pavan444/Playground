import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int fact = in.nextInt();
    System.out.print(factorial(fact));
  }
  public static int factorial(int fact)
  {
   
   if(fact == 0)
   {     
     return 1;
   }
   else
   {      
    
     return fact* factorial(fact-1);
  }
    
  }
}