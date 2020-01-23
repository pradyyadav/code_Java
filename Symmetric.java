import java.util.Arrays;
class Symmetric
{
	public static void main(String args[])
	{
		int count=0,a[][]={{1,4,5},{4,2,6},{5,6,3}};
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
					if(a[i][j]==a[j][i])
					count++;
					
				}
			}
		if(count>=3)
		System.out.println("Symmetric");
		else
		System.out.println("not Symmetric");
		
		
		
	}
}
