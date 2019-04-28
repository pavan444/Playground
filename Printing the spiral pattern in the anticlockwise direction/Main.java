import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[][] = new int[n][n];
      print_spirally(a,n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
 public static void print_spirally(int a[][],int n)
 {
      int val=1,r_min=0,c_min=0,r_max=n-1,c_max=n-1;
      while((r_min <= r_max)&&(c_min <= c_max))
            {
              
             for(int i = c_max; i >= c_min ; i--)
             {
               a[r_min][i] = val++;
             }
        for(int i = r_min + 1; (i <= r_max); i++)
            {
                a[i][c_min] = val++;
            }
            // Traversing from Right to Left
            for(int i = c_min+1; (i <= c_max); i++)
            {
                a[r_max][i] = val++;
            }
            // Traversing from Bottom to Top
            for(int i = r_max - 1; (i >= r_min+1); i--)
            {
                a[i][c_max] = val++;
            }
            // Updating the index values of row and column for the next spiral cycle
           r_min++; c_min++; r_max--; c_max--;
              
              
            }
} 
    }
