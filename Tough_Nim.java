package Randome;
import java.util.Scanner;
public class Tough_Nim 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int max=30,min=20,ch,t,us,userScore=0;
        int totalSticks;
        System.out.println(" \n Game Rules : One who picks the stick last wins. "+ "Computer Generate Random Number of Sticks between 40-80 ");
           
        
        while(true)
        {
            
            System.out.println("1. Yes, I want to play first");
            System.out.println("2. No, I want Computer play first ");
            System.out.println("3. No, I want to Quit");
            System.out.print("Enter Your Choice : ");
            ch=sc.nextInt();
      
            if(ch==3)
                break;
      
            totalSticks = (int)(Math.random()*(max-min+1)+min);
            
            System.out.println("Total Sticks : "+totalSticks);
            
            while(true)
            {
                t = (int)(Math.random()*(7-3+1)+3);
                
                if(ch==1)
                {
                    System.out.print("Enter Sticks from 1 to "+t+" : ");
                    us = sc.nextInt();

                    while(us<1&&us>t)
                    {
                        System.out.println("Please choose only from 1 to "+t+" : ");
                        us = sc.nextInt();                    
                    }

                    totalSticks -= us;
                    System.out.println("Sticks Left:"+totalSticks); 
                    ch = 2;
                    if(totalSticks<=0)
                    {
                        userScore+=5;
                        
                        System.out.println("You Won \n Your Score : "+userScore);
                        
                        break;
                    }
                }
                else if(ch==2)
                {
                    us = (int)(Math.random()*(t-1+1)+1);
                    System.out.println("Computer Selected : "+us);
                    
                    totalSticks -= us;
                    ch = 1;
                    System.out.println("Sticks Left:"+totalSticks);
                    if(totalSticks<=0)
                    {
                        userScore-=5;
                        
                        System.out.println("Computer wins the game \n Your Score : "+userScore);
                        
                        break;
                    }
                }
            }
        }
        
    }
}
