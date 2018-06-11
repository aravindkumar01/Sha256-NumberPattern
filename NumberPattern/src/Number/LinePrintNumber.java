package Number;

import java.util.Scanner;

public class LinePrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter Number");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			
			for(int j=i;j<=num;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		
		
	}

}
