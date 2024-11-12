import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	   int []arr ={5,4,7,8,2,1,6,9,78,74,10,78,32,65,47,24,354,542};
	   for (int i=0;i<arr.length-1;i++)
	   {
	       for(int j=0;j<arr.length-1;j++)
	       {
	           if(arr[j]>=arr[j+1])
	           {
	                int temp =arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	                
	           }
	           System.out.print(" "+arr[j]);
	       }
	       System.out.println("");
	   }

	}
}