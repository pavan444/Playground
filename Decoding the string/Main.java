import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    StringBuilder sb = new StringBuilder(s);
    int key = in.nextInt();
    
    int len = sb.length();
    for(int i = 0; i < len;i++)
    {
      char ch = sb.charAt(i);
      if(ch >= 'A' && ch <= 'Z')
      {
        ch=(char)(ch - key);
        if(ch < 'A')
        {
          
          int val;
         val =(int)('A' - ch); 
         ch = (char)('A'+ch);
        }
        sb.setCharAt(i,ch);
      }
      else if(ch >= 'a' && ch <= 'z')
      {
        ch=(char)(ch -key);
         if(ch < 'a')
        {
         int val;
         val =(int)('a' - ch); 
         ch = (char)('z'-val+1);
        }
        sb.setCharAt(i,ch);
      }
        
        
      }
    
    System.out.print(sb);
    
  }
}