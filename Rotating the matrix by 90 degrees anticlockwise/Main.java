import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in  = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int a[][]= new int[r][c];
    for(int i = 0; i < r;i++)
    {
      for(int j = 0; j < c; j++)
      {
       a[i][j]=in.nextInt();
      }
    }
    for(int k = c-1; k >=0; k--)
    {
      for(int i = 0; i < c;i++)
        System.out.print(a[i][k]+" ");
      System.out.println();
    }
    
  }
}