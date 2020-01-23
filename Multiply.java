import java.util.Arrays;
class Multiply
{
	public static void main(String args[])
	{int i,j,k;
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};
		int c[][]={{0,0,0},{0,0,0},{0,0,0}};
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			for(k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}	
		}
	System.out.println("Multiplication of arrays \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			System.out.println(c[i][j]);
		}
	}
}
}
