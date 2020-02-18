import java.util.Scanner;
class Perimet
	{
		Perimet(float radius,float length,float breadth)
		{
			System.out.print("\nCircumference of Circle : " + (3.14*radius*2));
			System.out.print("\nPerimeteter of Rectangle : " + (2*(length+breadth)) + "\n");
		}
	}
class Area
{
	Area(float radius,float length,float breadth)
	{
		System.out.print("Area of Circle : " + (3.14*radius*radius));
		System.out.print("\nArea of Rectangle : " + (length*breadth));
	}
	
		
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of Circle : ");
		float r = scan.nextFloat();
		System.out.print("\nEnter the Length of Rectangle : ");
		float l = scan.nextFloat();
		System.out.print("\nEnter the Breadth of Rectangle : ");
		float b = scan.nextFloat();
		Area ob = new Area(r,l,b);
		Perimet ob1 = new Perimet(r,l,b);
	}
}
