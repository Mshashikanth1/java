import java.util.*;
import java.lang.*;
public class quadratic{
        public static void main(String[] args){
              int a,b,c;
	      
	      //creating the new scannner class to read
	      Scanner sc=new Scanner(System.in);
	      
	      //read coefficient of x^2 ,x, and constat
	      System.out.printf("Enter a:");
	      a=sc.nextInt();

	      System.out.printf("Enter b:");
	      b=sc.nextInt();

	      System.out.printf("Enter c:");
	      c=sc.nextInt();
	      
	      //printing the equation
	      System.out.printf("Givien quadratic equatioin :%dx^2+%dx+%d\n",a,b,c);
              
	      //calculating the discrimination
	      int d=(b*b-4*a*c);
	      
	      //cheking the type of roots
	      if(d>0){
	        double r1=(-b+Math.sqrt(d))/2*a;
		double r2=(-b-Math.sqrt(d))/2*a;
		System.out.printf("Roots are real and distinct \n First root is :"+r1+"\nSecond root is :"+r2+"\n");
		
	      }
	      else if(d==0){
	           double r=(-b)/2*a;
		   System.out.printf("Roots are real and equal:"+r+"\n");
	      }
	      else{
	          System.out.printf("the roots are imaginary\n");
	      }
       }


}
