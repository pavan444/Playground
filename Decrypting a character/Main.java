import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch= in.next().charAt(0);
      int key = in.nextInt();
      if(ch>='A' && ch<='Z')
        ch = (char)(ch-key);
      else if(ch>='a' && ch<='z')
        ch = (char)(ch+23);
      
      System.out.print(ch);
      
    }
}