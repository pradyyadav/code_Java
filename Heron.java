import java.util.Scanner;
import java.lang.Math;
class Heron
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter side 'a' of triangle : ");
int a = scan.nextInt();
System.out.println("\nEnter side 'b' of triangle : ");
int b = scan.nextInt();
System.out.println("\nEnter side 'c' of triangle : ");
int c = scan.nextInt();
float s = (a+b+c)/2;
float h = s*(s-a)*(s-b)*(s-c);
System.out.println("\nArea of triangle is : " + Math.sqrt(h));
System.out.println("\n");
}
}
