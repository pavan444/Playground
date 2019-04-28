import java.util.Scanner;
import java.lang.Math;
class Main{
  public static long pow(int x,int y)
  {
    long result = x; 
     for (int i = 1; i < y; i++) 
     {
       result = result * x;
     } 
    return result;
 }
  
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int e = in.nextInt();
      long power=pow(b,e);
      System.out.println(power);
	}
}