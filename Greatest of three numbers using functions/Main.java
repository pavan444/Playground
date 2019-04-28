import java.util.Scanner;
class Main{
  public static int greatest(int num1,int num2,int num3)
  {
    int max=0;
    max = num3 > (num1>num2 ? num1:num2) ? num3:((num1>num2) ? num1:num2);
    
    return max;
  
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      System.out.println(greatest(a,b,c));
	}
}