import java.util.Scanner;
class Perimeter
{
	Perimeter(float radius,float Side,float Length,float Breadth)
	{
		System.out.print("Circumference of Circle : " + (2*3.14*radius) + "\nArea of Circle : " + (3.14*radius*radius));
		System.out.print("\nPerimeter of Square : " + (4*Side) + "\nArea of Square : " + (Side*Side));
		System.out.print("\nPerimeter of Rectangle : " + (2*(Length+Breadth)) + "\nArea of Rectangle : " + (Length*Breadth));
		
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of Circle : ");
		float r = scan.nextFloat();
		System.out.println("Enter the Side of Square : ");
		float a = scan.nextFloat();
		System.out.println("Enter the Length of Rectangle : ");
		float l = scan.nextFloat();
		System.out.println("Enter the Breadth of Rectangle : ");
		float b = scan.nextFloat();
		
		Perimeter o = new Perimeter(r,a,l,b);
		
	}
}
