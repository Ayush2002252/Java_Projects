
import java.util.Random;
import java.util.Scanner;


public class Percentile 
{

	
    static void percentile(int arr[], int n)
    {
        int i, count;
        double percent;
        Random r=new Random();        
        int x=r.nextInt(0,n);
        System.out.println("Index Number  selected is ~ "+x);
        System.out.println("Random number from Array: "+arr[x]);
       
        count = x;
        percent = (count * 100) / (n - 1);
        
        
        System.out.print("Percentile of element = " + percent);

    }

    // Driver Code
    public static void main(String[] args)
    {
            int[] arr;
            
            arr=new int[50];
            System.out.println("Enter the size of Array");
            Scanner s;
            s=new Scanner(System.in);
            int k=s.nextInt();
            System.out.println(" elements are");
            for(int i=0;i<k;i++)
            {
            	Random n=new Random();    //n is random Object Created
            	int randomNumber=n.nextInt(0,100);
            	if(i==0)						//Entry Condition
            		arr[i]=randomNumber;
            	else arr[i]= randomNumber+arr[i-1];
            	System.out.println(arr[i]);
            }
            
            int n = k;


            percentile(arr, n);
    }
}



    

