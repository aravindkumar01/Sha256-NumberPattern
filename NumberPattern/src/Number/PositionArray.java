package Number;

import java.util.Scanner;

public class PositionArray {
	
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
        System.out.println("enter size of array");
	 int	size=in.nextInt();
		int arr[]=new int[size+1];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<size;i++)
		{
			
			arr[i]=in.nextInt();
		}
		

		for(int a:arr)
		{
			System.out.println(a);
		} 
		
		System.out.println("Enter the position");
		int position=in.nextInt();
		System.out.println("enter the element");
		int ele=in.nextInt();
		//System.out.println(arr);
		for(int j=size-1;j>=position;j--)
		{
		   arr[j+1]=arr[j]; 
			
		}
		arr[position]=ele;
		
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
