
import java.util.Scanner;
public class perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a, n,sum=0;
       Scanner r = new Scanner(System.in);
       System.out.println("enter num");
       n=r.nextInt();
       
       for(int i=1; i<n; i++)
       { 
    	   if(n%i==0)
         {
    	   sum=sum+i;
         } 
       }
       if (sum==n)
       { 
    	   System.out.println("entered no is perfect number");
	   }
       else  System.out.println(n+" is not a perfect number");
   }
 }