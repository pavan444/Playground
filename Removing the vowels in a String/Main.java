import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String r;
    r = vowel(s);
    System.out.print(r);
  }
  public static String vowel(String s)
  {
    String finalstring="";
    for(int i = 0; i < s.length(); i++)
    {
      if(!vowels(Character.toLowerCase(s.charAt(i))))
         {
           finalstring = finalstring + s.charAt(i);
      }
    }
    return finalstring;
  }
  public static boolean vowels(char c)
  {
    String vow="aeiou";
    for(int i =0; i < 5;i++)
    {
      if(vow.charAt(i) == c)
        return true;
    }
    return false;
  }
    
    
    
  
  
  
}