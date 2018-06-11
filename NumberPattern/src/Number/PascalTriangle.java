package Number;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		int num=in.nextInt();
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-i;j++)
			{
				System.out.print(" ");
			}
			int temp=1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(temp+" ");
				temp=temp * (i-k) / (k+1) ;
			}
			System.out.println();
		}
		

	}

}
