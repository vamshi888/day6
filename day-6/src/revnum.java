
import java.util.*;
public class revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rem=0,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num ");
		 n=sc.nextInt();
		 
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse no is "+rev);	
		
}

}
