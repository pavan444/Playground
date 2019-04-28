import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i < size; i++)
      {
        arr[i] = in.nextInt();
      }
      
      int arr1[] = new int [size];
      int num = size;
      for(int i = 0; i < size; i++)
      {
        arr1[i] = num;
        num--;
      }
      int cnt = 0,j;
       for(int i = 0; i < size; i++)
      {
         for( j =0; j < size ; j++)
         {
           if(arr1[j] == arr[i])
           {
            arr[i] = -1; 
            arr1[j]=-1;
           }
         }
        
       }
      for(int i = 0; i < size; i++)
      {
        if(arr1[i] != -1)
           System.out.print(arr1[i]);
      }
       
      
    }
}