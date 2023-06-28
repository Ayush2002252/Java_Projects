import java.lang.*;
import java.util.*;
import java.io.*;

public class Wicke_Nim {
	
	private static int exit;

	public static void main(String[] args) {
		int c=5;
		do
		{
			
		System.out.println(" Game Rules : One who picks the stick last wins. Computer Generate Random Number of Sticks between 40-80 \n");
		Random dice=new Random(); //Random Number Generated
	int stick= 40+dice.nextInt(40);  //Random Number range Set
	System.out.println(" If You Wanna Take First Turn enter true else false \n");
	
	boolean choice =true;
	int user = 0;
	
	try{
		Scanner ch=new Scanner(System.in);
		choice=ch.nextBoolean();
		
	}
	catch(Exception ex) {}
	if(!choice) {
		do
		{
			if(stick>=4)
			{stick=(stick-(stick%4));			//Hey Computer Pick computer Pick the sticks such that user get to pick from (stick % 4 ==0)
			}
			else
				{
				stick=0;						// Hey Computer Now pick Them all
				
					}
			if(stick==0) {
				System.out.println("Chill !!  You lost from computer \n Wanna Continue Press 5 and -5 to exit");			// Checking if all sticks are over
				break;
			}
				
			System.out.println("Number of Sticks Remaining " + stick );
			System.out.println("/n Please Pick Stick 1,2,3 /n");
			try {
			Scanner sc = new Scanner(System.in);
			user=sc.nextInt();}
			catch(Exception ex)
			{
			}
			if(user>=4)
			{
				System.out.println("Wrong Input enter 1,2,3");
				Scanner sc = new Scanner(System.in);
				user=sc.nextInt();
				
			}
			stick=stick-user;                   //User Stick Removed
			if(stick==0) {
			System.out.println("Computer Loose");							//Checking if all sticks are over
			break;
			}
			} while(stick!=0);
	}
	
	else if(choice) {
		stick=(stick-(stick%4));			// Tampering with Random Number
	
	do
	{
		System.out.println("Number of Sticks Remaining " + stick );
		System.out.println("/n Please Pick Stick 1,2,3 /n");
		try {
		Scanner sc=new Scanner(System.in);
		user=sc.nextInt();}
		catch(Exception ex)
		{
			
		}
		if(user>=4)
		{
			System.out.println("Wrong Input enter 1,2,3");
			Scanner sc = new Scanner(System.in);
			user=sc.nextInt();}
			
		stick=stick-user; //User Stick Removed
		if(stick==0) {
		System.out.println("Computer Loose");
		break;
		}
		
		if(stick%4 == 0)
		{
			stick=stick-3;
		}
		else if(stick>=4)
		{stick=(stick-(stick%4));							//Computer Pick
		}
		
		else stick=0; 							// Hey Computer Pick them all

		if(stick==0) {
			System.out.println("Chill !!  You lost from computer \n Wanna Continue Press 5 and -5 to exit");
			break;
		}
		
		
		
	} while(stick!=0);
		// 
	}
	Scanner ket = new Scanner(System.in);
	c=ket.nextInt();
		} while(c==5);
	}
}
