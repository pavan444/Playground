import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n,temp2=n;
    int count = 0;
    
    if( n < 0)
    {
      n = -1 * n;
      temp = n;
    }
    
    while(n > 0)
    {
        count++;
        n = n/10;
    }
    
    char str[] = new char[count];
    count = count - 1;
    while(temp > 0)
    {
      char ch = (char)((temp % 10) + '0');
      str[count] = ch;
      temp /= 10;
      --count;   
    }
    if(temp2 < 0)
    {
      System.out.print("-");
      System.out.print(str);
    }
    else
      System.out.print(str);
  }
}