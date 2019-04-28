import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int count=1;
      Scanner ob = new Scanner(System.in);
      int n=ob.nextInt();
      
      while(count <= n)
      {
        System.out.println("I am a Java Developer");
        count = count + 1;
      }
	}
}