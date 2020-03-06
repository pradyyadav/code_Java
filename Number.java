import java.util.Scanner;
class Number
{
	public class Operation
	{
		public int display1(int n)
		{
			int fact = 1;
			for(int i = 1;i<=n;i++)
			{
				fact*=i;
			}	
			return fact;
		}
		public int display2(int n,int f)
		{
			return n+f;
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Number p = new Number();
		Number.Operation o = p.new Operation(); 
		int num = scan.nextInt();
		System.out.print("Factorial of " + num + " is : " + o.display1(num) + "\n"  );
		int factorial = o.display1(num);
		System.out.print("Sum : " + o.display2(num,factorial) + "\n");
	}

}

