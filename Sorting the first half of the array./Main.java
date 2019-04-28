import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n;i++)
    {
      arr[i] = in.nextInt();
    }
    insertion_sort(arr,n/2);
     for(int i =0; i < n;i++)
     {
       System.out.print(arr[i]+" ");
     }
  }
   public static void insertion_sort(int arr[],int k)
   {
     
     for(int idx1=0; idx1 < k;idx1++)
     {
      int key = arr[idx1];
       int idx2 = idx1-1;
       
       while(idx2>=0 && arr[idx2] > key)
       {
        arr[idx2+1]=arr[idx2]; 
         idx2--;
         
       }
       arr[idx2+1]=key;
     }
    
    
    
  }
}