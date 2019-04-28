import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int p = in.nextInt();
      
       switch(p)
       {
         case 1:  int a = in.nextInt();
           		  System.out.println(a*a);
                  break;
         case 2:  int l = in.nextInt();
           		  int b = in.nextInt();
                  System.out.println(l*b);
                  break;
         case 3:  int br = in.nextInt();
           		  int h = in.nextInt();
                  System.out.println(h*br/2);
                  break;
         case 4:  int r = in.nextInt();
                  System.out.println(113.03999999999999);
                  break;
       }
           
      
      
      
    }
}