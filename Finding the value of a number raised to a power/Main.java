import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int e = in.nextInt();
      long temp=1;
      while( e !=0 )
      {
       temp *= b; 
       e--; 
      }
      System.out.println(temp);
      
    }
}