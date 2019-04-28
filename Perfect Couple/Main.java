import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
       Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int arr[] = new int[n];
  for(int i = 0; i < n ; i++)
  {
    arr[i]=in.nextInt();
  }
      int val = in.nextInt();
  pair(arr,n,val);
}
public static void pair(int arr[],int n,int val)
{
 int num = 1;  
  for(int i=0;i < n-1;i++)
  {
  
    for(int j= num ; j <n;j++)
    {
     int  sum = arr[i]+arr[j];
      if( sum == val)
         System.out.println(arr[i]+ ", "+arr[j]); 
      
    }
    num++;
     
  }
  }    
}