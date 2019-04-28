import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
      int stat[] = new int[25];
      
      for(int idx = 0; idx < s1.length(); idx++)
      {
        char ch = s1.charAt(idx) ;
        if(ch >= 'a' && ch<= 'z')
        {
          int val = ch - 'a';
          stat[val]++;
        }
        else if(ch >= 'A' && ch<= 'Z')
        {
          int val = ch - 'A';
          stat[val]++;
        }
      }
      for(int i = 0; i < stat.length; i++)
      {
        if( stat[i] == 0){
          char ch =(char)('a' + i);
          System.out.print(ch+" ");
         
       }
      }
       System.out.print("z");
      
    }
}