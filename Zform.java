import java.util.Scanner;
class Zform
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the order of the square matrix : ");
	int n=scan.nextInt();
	int a[][] = new int[n][n];
	System.out.println("Enter the elements in the array.\n");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=scan.nextInt();
		}
	}
	System.out.println("The array is \n");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j] + " ");
			
		}
		System.out.println("\n");
	}
	for(int i=1;i<n-1;i++)
	{
		for(int j=0;j<n;j++)
		{
			if((i+j)!=(n-1))
			{
				a[i][j]=0;
			}
			else{}
		}
	}	
	System.out.println("The Zform array is \n");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j] + " ");
			
		}
		System.out.println("\n");
	}
	}
}
