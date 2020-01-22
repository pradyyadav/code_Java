import java.util.Scanner;
class Pattern
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int a,b,c,d,s=0;
a=scan.nextInt();
b=a;
for (c=1;c<=b;c++)
{
for(d=0;d<2*b-c;d++)
{
if(d<c-1)
System.out.println(" ");
else if(d%2 == 0 && c%2== 1 || d%2 == 1 && c%2 == 0)
System.out.println("1 ");
else
System.out.println("0 ");
}
}
}
}
