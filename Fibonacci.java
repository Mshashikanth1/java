import java.util.*;
public class Fibonacci{
       public static int fib(int n){
              if(n==0){
	        return 0;
	      }
	      else if (n==1){
	           return 1;
	      }
	      else{
	           return fib(n-1)+fib(n-2);
	      }
       
       }


       public static void main(String[] argv){
               //first two members of fib sequece are 0,1 and next will be obtained by adding pprevious two memebers
	       int a=0,b=1;
	       
	       //creating the scanner object
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();

               //run a loop one to n
	       //print a and add a,b and store them in c and swap a,b and b,c
	       for(int i=0;i<n;i++){
		   System.out.printf("%d ",a);
		   int c=a+b;
		   a=b;
		   b=c;

	       }

	       //nth fibonacci number using recursion
	       System.out.printf("\n%d",fib(n));

	    
       
       }


}
