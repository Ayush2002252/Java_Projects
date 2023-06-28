
package Randome;
import java.lang.Math;
import java.util.Scanner;
public class GuessingGame
{
    public static void main(String [] args)
    {
        int min=0;
        int max=50;
        int range=max-min+1;
        int i =(int)(Math.random()*(range)+min);
        int guess;
        int attempts=0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
           
           System.out.println("Enter a value between 0 to 50:");
           guess = sc.nextInt();
           attempts += 1;
           if(guess==i)
           {
               System.out.println("Correct....You WIN");
               System.out.println("You have made total of "+attempts+" attempts to find the number!");
               break;
           }
           else if(guess<i)
           {
               System.out.println("Guess higher value");
           }
            else if(guess>i)
           {
               System.out.println("Guess lower value");
           }
           
        }
      
    }
    
}
