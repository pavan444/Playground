import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      
      int is_prime = 1,num,n=30;
     for(num=30;num<=50;num++)
     {
      for(n=30;n<=num/2;n++)
      {
         if(num%n == 0)
        {
           is_prime=0;
           break;
       }
      }  
        if(is_prime == 1)
           System.out.println(num);
       
      
     }
	}
}