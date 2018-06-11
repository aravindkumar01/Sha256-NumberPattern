package Number;

import java.util.Scanner;

public class DiamondShapeStar {
	
	public static  void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter rows");
		int row=in.nextInt();
		
		for (int i = 0; i <=row; i++) {
			
			for(int j=0;j<row-i;j++)
			{
				System.out.print(" ");
                
			}
			
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
				
			}			
		    //System.out.print("**");
		System.out.println();
		
		}
    for (int k = 0; k <=row	-1; k++) {
			
			for(int j=row-1;j<=k;j--)
			{
				System.out.print(" ");
			
			}
			
			for (int j = 1; j <= 2 * (row - k) - 1; j++) {
				System.out.print("*");
				
			}			
		    //System.out.print("**");
		System.out.println();
		
		}
		
		
		
	}
    

}
