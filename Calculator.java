class Calculator
{
	int add(int p,int q,int r)
	{ System.out.println(p+q+r);
		return 0;
	}
	int sub(int a,int b)
	{System.out.println(a-b);
	return 0;}
	int mult(int w,int x,int y,int z)
	{System.out.println(w*x*y*z);
	return 0;}
	int div(int b,int c)
	{System.out.println(b/c);
	return 0;}
	public static void main(String args[])
	{
		Calculator a = new Calculator();
		Calculator b = new Calculator();
		Calculator c = new Calculator();
		Calculator d = new Calculator();
		a.add(1,2,3);
		b.sub(3,4);
		c.mult(1,2,3,4);
		d.div(1,2);

	}

}
