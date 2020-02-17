import java.util.Scanner;
class Markov
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int sum[]={0,0,0},count=0;
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
				sum[i]+=a[i][j];
			}
		}	
		for(int i = 0; i<row; i++)
		{
		count+=sum[i];
		}
		if(count==row)
		{System.out.println("Markov Matrix");}
		else{System.out.println("Non Markov Matrix");}
	}
}
