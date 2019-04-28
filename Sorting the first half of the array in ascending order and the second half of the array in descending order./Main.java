import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr1[] = new int[(n)/2];
     int arr2[] = new int[n - arr1.length];
    for(int i = 0; i < arr1.length;i++)
    {
      arr1[i] = in.nextInt();
    }
    for(int i=0; i < arr2.length;i++)
    {
     arr2[i] = in.nextInt(); 
    }
    insertion_sort_inc(arr1,n/2);
     insertion_sort_dec(arr2,n - arr1.length);    
     for(int i =0; i < arr1.length;i++)
     {
       System.out.print(arr1[i]+" ");
     }
    for(int i =0; i < arr2.length;i++)
     {
       System.out.print(arr2[i]+" ");
     }
  }
   public static void insertion_sort_inc(int arr[],int k)
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
  public static void insertion_sort_dec(int arr[],int k)
   {
     
     for(int idx1=0; idx1 < k;idx1++)
     {
      int key = arr[idx1];
       int idx2 = idx1-1;
       
       while(idx2>=0 && arr[idx2] < key)
       {
        arr[idx2+1]=arr[idx2]; 
         idx2--;
         
       }
       arr[idx2+1]=key;
     }   
  }
}