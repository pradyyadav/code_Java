import java.util.Scanner;
class Calculate
{
	int Calculate(int p,int q,int r)
	{ System.out.println(p+q+r);
		return 0;
	}
	int Calculate(int a,int b)
	{System.out.println(a-b);
	return 0;}
	int Calculate(int w,int x,int y,int z)
	{System.out.println(w*x*y*z);
	return 0;}
	int Calculate(float b,float c)
	{System.out.println(b/c);
	return 0;}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three numbers \n");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		float n5 = scan.nextFloat();
		float n6 = scan.nextFloat();
		Calculate a = new Calculate(n1,n2,n3);
		Calculate b = new Calculate(n3,n4);
		Calculate c = new Calculate(n1,n2,n3,n4);
		Calculate d = new Calculate(n5,n6);
		

	}

}
