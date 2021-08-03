import java.util.*;
public class matrixmulti{
       public static void read(int[][] a,int s){
	      Scanner sc=new Scanner(System.in);
              for(int i=0;i<s;i++){
	          for(int j=0;j<s;j++){
		     int ele=sc.nextInt();
		     a[i][j]=ele;
		  }
	      }
       }

       public static void print(int[][] a,int s){
              for(int i=0;i<s;i++){
		      for(int j=0;j<s;j++){
		          System.out.printf("%d ",a[i][j]);
		      
		      }
		 System.out.printf("\n");
       }
       }

       public static void main(String[] args){
              
	      //new scanner class
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the size of square matrix");
	      int s=sc.nextInt();
	      int a[][]=new int[s][s];
	      int b[][]=new int[s][s];
	      int c[][]=new int[s][s];
              System.out.println("Enter the elements of 1st matrix rowise:");
              read(a,s);
	      System.out.println("Enter the elemnents of 2nd matric rowise:");
	      read(b,s);
	      for(int i=0;i<s;i++){
	          for(int j=0;j<s;j++){
		      for(int k=0;k<s;k++){
		          c[i][j]+=a[i][k]*b[i][k];
		      }
		  }
	      }
	      System.out.println("The resultant matris is:");
	      print(c,s);
       
       }

}
