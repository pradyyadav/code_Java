import java.util.Scanner;
class Cube
{
public static void main(String args[])
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter a number to print cubes till that number : ");
int n=scan.nextInt();
for(int i = 1 ; i<= n; i++)
{
System.out.println("Number is : " + i + " and cube of " + i +" is : " + (i*i*i) + "\n" );
}
}
}
