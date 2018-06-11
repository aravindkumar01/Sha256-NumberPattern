package Number;

import java.util.Scanner;

public final class FloydTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number"
				+ "");
		int num=in.nextInt();
		int count=1;
		for(int i=1;i<num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
	            System.out.println();	
		}
		
		
		
	}

}
