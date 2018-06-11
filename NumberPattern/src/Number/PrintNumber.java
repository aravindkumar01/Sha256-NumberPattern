package Number;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your number");
	int a=scan.nextInt();
	for(int i=1;i<=a;i++)
	{
		System.out.print(a);
		
		
	}
	System.out.println();
	for(int j=1;j<=a;j++)
	{
		System.out.println(a+""+j+""+a);
	}
	}

	
}
