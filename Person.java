import java.util.Scanner;
class Person
{
	float height,weight;
	float update_fields(float x,float y)
	{
		System.out.println("\nHeight : " + (2*x));
		System.out.println("\nWeight : " + (2*y));
		return 0;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Person h = new Person();
		System.out.println("Enter the height of the person : ");
		h.height = scan.nextFloat();
		System.out.println("\nEnter the weight of the person : ");
		h.weight = scan.nextFloat();
		System.out.println("\nThe doubled height and weights are ");
		h.update_fields(h.height,h.weight); 
	}	
}
