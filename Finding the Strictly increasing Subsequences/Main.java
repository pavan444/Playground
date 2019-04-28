import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = in.nextInt();
    }
    int ele1=0,ele2=0;
    for(int i = 0; i < n;i++)
    {
      for(int j = i+1; j < n; j++)
      {
        if( arr[i] < arr[j])
        {
          if(arr[j] > ele2)
          {
             System.out.println(arr[i]+","+arr[j]);
              ele2 = arr[j];
          }
        }
      
      }
      
      ele2=0;
    }
    
  }
}