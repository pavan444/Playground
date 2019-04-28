import java.util.Scanner;
class Main{
  public static int pnumber(int n)
  {
     int i =0;
       int num =0;
       //Empty String
      

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	      System.out.println(i);
	  }	
       }	
       
      
    return 0; 
  }
  
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      int prime = pnumber(n);
      
	}
}