

import java.util.Scanner;

public class Basic_Nim{
    
    public static int fetchComputerMoves(int left) 
    {
         int computerTurn = (int) (Math.random()*3)+1;
         return computerTurn;
    }
   
    public static void main (String[] args)
    {

    int min=40,max=80;int total=80;
    int range = max-min+1;
    int elementsLeft;
    int ch,ran;
    int score=0;
    int userScore=0;

    Basic_Nim nm = new Basic_Nim();
    
    
    while(true)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\nAre You Want to Play first");
        System.out.println("1. Yes, I want to play first ");
        System.out.println("2. No, I want Computer play first  ");
        System.out.println("3. No, I want to Quit ");
        System.out.println("Enter Your Choice");
        ch =sc.nextInt();
       
        ran=(int)(Math.random()*range)+min;
        elementsLeft = ran;
        System.out.println("The number of elements to start the game is "+ elementsLeft);
        if(ch==1)
        {
            while(elementsLeft>0)
            {
                
                System.out.println("It's your turn: Enter (1 , 2 or 3) ");
                int personMove = sc.nextInt();
                while (personMove != 1 && personMove != 2 && personMove !=3)
                {
                    System.out.println("Please choose 1, 2 or 3 only");
                    personMove = sc.nextInt();
                }
                
                elementsLeft = elementsLeft - personMove;
                System.out.println("After your move!! the number of elements left: "+elementsLeft);
                System.out.println("");
                if (elementsLeft <= 0)
                { 
                    System.out.println("You win the game!");
                    if(userScore==score)
                    {
                        userScore+=5;
                        System.out.println("Your total score :"+userScore);
                        score=userScore;
                        return;
                    }
                
                }   
                 int computerMove = fetchComputerMoves(elementsLeft);
                System.out.println("Computer moves " + computerMove);
                elementsLeft = elementsLeft - computerMove;
                System.out.println("Now only " + elementsLeft + " elementsLeft");
                System.out.println("");

                if (elementsLeft <= 0)
                {
                    System.out.println("Computer wins the game!");
                    if(userScore==score)
                    {
                        userScore-=5;
                        System.out.println("Your total score :"+userScore);
                        score=userScore;
                    }
                   
                }   

            }
        }
        else if(ch==2)
        { 

            while(elementsLeft>0)
            {
                int computerMove = fetchComputerMoves(elementsLeft);
                System.out.println("Computer moves " + computerMove);
                elementsLeft = elementsLeft - computerMove;
                System.out.println("Now only " + elementsLeft + " elementsLeft");
                System.out.println("");

                if (elementsLeft<=0)
                {
                    System.out.println("Computer wins the game!");
                    if(userScore==score)
                    {
                        userScore-=5;
                        System.out.println("Your total score :"+userScore);
                        score=userScore;
                    }
                    return ;
                }   

                System.out.println("It's your turn now: Enter (1 , 2 or 3) ");
                int personMove = sc.nextInt();
                while (personMove != 1 && personMove != 2 && personMove !=3)
                {
                    System.out.println("Please choose 1, 2 or 3 only");
                    personMove = sc.nextInt();
                }
                elementsLeft = elementsLeft - personMove;
                System.out.println("After your move!! the number of elements left: "+elementsLeft);
                System.out.println("");
                if (elementsLeft <= 0)
                { 
                    System.out.println("You win the game!");
                    if(userScore==score)
                    {
                        userScore+=5;
                        System.out.println("Your total score :"+userScore);
                        score=userScore;
                    }    
                }   
            }

        }
        else if(ch==3)
        {
           break; 
        }
        else
        {
            System.out.println("Wrong Input.....Try Again");
        }

    }
}


   
}
