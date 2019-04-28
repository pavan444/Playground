import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
      String s2 = in.nextLine();
      int count = 0;
    for(int i = 0 ; i < s1.length()-s2.length()+1 ; i++)
    {
      boolean is_matching = true;
      for(int j = 0; j < s2.length() ;j++)
      {
        if(s1.charAt(i+j) != s2.charAt(j))
        {
          is_matching = false;
        }
      }
      if(is_matching == true)
        count++;
    }
    System.out.println(count);
    
    
    
    
    
  } 
}
