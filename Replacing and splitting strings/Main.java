import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      String[] s = str2.split("\\s");
      for(String a:s)
      {
      System.out.println(a);  
        
      }
      
      
    }
}