import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int option = in.nextInt();
      if(option == 1)
      {
        System.out.println("One");
      }
      else if(option == 2)
      {
        System.out.println("Two");
      }
     else if(option == 3)
      {
        System.out.println("Three");
      }
     else if(option == 4)
      {
        System.out.println("Four");
      }
      else if(option == 5)
      {
        System.out.println("Five");
      }
      else
        System.out.println("Invalid");
        
	}
}