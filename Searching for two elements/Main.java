import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0; i < arr_size; i++)
      {
        arr[i]=in.nextInt();
      }
      
      int ele1 = in.nextInt();
      int ele2 = in.nextInt();
      int ele_idx1 = -1;
      int ele_idx2 = -1;
      for(int i = 0; i < arr_size; i++)
      {
        if(arr[i] == ele1)
          ele_idx1 = i;
        if(arr[i] == ele2)
          ele_idx2 = i;
      }
      System.out.println(ele_idx1);
      System.out.println(ele_idx2);
      
      
      
    }
}