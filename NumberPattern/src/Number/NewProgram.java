package Number;

import java.util.Scanner;

public class NewProgram {

	
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter account num limit");
         String acc=in.nextLine();
	       
         int array[]=new int[acc.length()];
		
         for(int i=0;i<acc.length();i++)
         {
        	 array[i]= acc.charAt(i);
        	 System.out.println(acc.charAt(i));
         }
         System.out.println();
         for(int j=0;j<acc.length();j++)
         {
        	 System.out.println(array[j]);
         }
         
		
		
	}
}
