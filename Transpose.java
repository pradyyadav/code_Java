import java.util.Arrays;
class Transpose
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Array is \n ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<i;j++)
			{
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		System.out.println("Transpose of matrix \n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}
