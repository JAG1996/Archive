import java.util.Scanner; // Needed for the Scanner class

public class TheNthFibonacci
{// Start of class
   public static void main(String[] args)
   {// Start of main
   
      long a = 0;
      long b = 0;
      long c = 1;
   
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What position in the series do you want to get? ");
      long num = keyboard.nextLong();
      
      if (num >= 91 || num <= 0)
      {//Start of if
         System.out.println("Invalid input. Try any number from 1 through 90.");
      }//End of if
      
      else
      {//Start of else
         for (long n = 2; n <= num; n++)
         {//Start of 'n' for loop
            a = b;
            b = c;
            c = a + b;
         }//End of 'n' for loop
      
         System.out.printf("The %dth term in the Fibonacci series is %,d.", num, c);
      }//End of else
            
   }// End of main
}// End of class