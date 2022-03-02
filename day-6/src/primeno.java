
import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no = sc.nextInt();
		int temp = 0;
		
		for(int i=2; i<=no-1; i++)
		{
			if(no%i==0)
			{ 
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(no+" is a prime number");
			
	    }
		else  
			System.out.println(no+" is not a prime number");
     }
	}
