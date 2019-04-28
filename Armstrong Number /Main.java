import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       int n, nu, num=0, rem;
        Scanner scan = new Scanner(System.in);
		
       
        n = scan.nextInt();
		
        nu = n;
		
        while(nu != 0)
        {
            rem = nu%10;
            num = num + rem*rem*rem;
            nu = nu/10;
        }
        if(num == n)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not a Armstrong Number");
        }
	}
}