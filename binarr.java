import java.util.Scanner;
class binarr
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int count=0; 
		System.out.print("Enter number of rows in matrix : ");
		int row = scan.nextInt();
		System.out.print("Enter number of columns in matrix : ");
		int col = scan.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter elements in matrix\n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j] = scan.nextInt(); 		
			}
		
		}
		System.out.println("The array is \n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j] + " ");
			
			}
		System.out.println("\n");
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]==0 || a[i][j]==1)
				{
					count++;
				}	
				else{}
			}
		}
		if(count==(row*col))
		{
		System.out.println("Binary Matrix");
		}
		else
		{
			System.out.println("Non Binary Matrix");
		}
	}
}
