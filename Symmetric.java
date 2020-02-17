import java.util.Arrays;
import java.util.Scanner;
class Symmetric
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the order of matrix : ");
		int n = scan.nextInt();
		int a[][] = new int[n][n];
		int count=0;
		System.out.print("Enter the elements in the matrix\n\n");
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("\nArray is \n ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
		for(int i=0;i<n;i++)
			{
				for(int j=0;j<=i;j++)
				{
					if(a[i][j]==a[j][i])
					count++;
					
				}
			}

		if(count>n)
		System.out.println("Symmetric");
		else
		System.out.println("not Symmetric");
		
		
		
	}
}
