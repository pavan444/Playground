import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
perfect_batch(list, n);
}

public static void perfect_batch(int list[], int n)
{
  
  int max_idx=0,max = list[0];
  for(int i = 1; i < n; i++)
  {
    if(max < list[i])
    {
      max = list[i];
      max_idx = i;
    }
  }

  System.out.print(max_idx);
  
  
  }
}