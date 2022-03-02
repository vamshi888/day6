
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=0, b=1, c;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any no");
         int n= sc.nextInt();
         System.out.println(a+" "+b);
                
         for(int i=1; i<=n; i++)
         {
        	 c=a+b;
          System.out.println(""+c);
         
             a=b;
             b=c;
	     }
     }
	}


