import java.util.Scanner;
class Equal
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter three numbers two check their equality : ");
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
if(a==b && a==c)
{System.out.println("All numbers are equal.\n");}
else if(a!=b && a!=c && b!=c)
{System.out.println("All numbers are different.\n");}
else
{System.out.println("Neither all are equal or different.\n");}
}
}
