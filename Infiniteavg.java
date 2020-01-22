import java.util.Scanner;
class Infiniteavg
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int a,b=0,c,s=0;
char ch;
System.out.println("Enter number : ");
a=scan.nextInt();
s=s+a;
b=b+1;
System.out.println("Press q to quit else y to continue : ");
ch = scan.next().charAt(0);
while(ch!='q' && ch!='Q')
{
System.out.println("Enter number : ");
s=s+a;
b=b+1;
System.out.println("Press q to quit");
ch = scan.next().charAt(0);
System.out.println("average : " + s/b*1.0);
}
}

}
