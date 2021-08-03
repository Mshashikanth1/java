import java.util.*;
public class Palindrome{
       public static void main(String[] argv){
               Scanner sc=new Scanner(System.in);
	       //to read a string use nextLine() funtion in scanner class
	       String st=sc.nextLine();

              //to get the length of string recived use .length() function
	       int i=0,j=st.length()-1,flag=1;

	       //to access the charecter at the index use the .chatAt() function 
	       //System.out.println(st.charAt(0));
	       //using two pointer from left and write checking equal or not
	       while (i<j){
	             if(st.charAt(i)!=st.charAt(j)){
		        flag=0;
		     }
		     i++;
		     j--;

	       }
	       //checkin wheter the flag changed or not
	       //the java will not interpret int as boolean use boolean in if statement
	       if(flag==1){
	          System.out.printf("Palindrome!");

	       }
	       else{
	           System.out.printf("Not a Palindrome!");
	       }
       
       }
       
}
