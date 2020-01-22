import java.util.Scanner;
class Harshad
{

public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int sum = 0;
System.out.println("Enter a number to check it is Harshad or not : ");
int n = scan.nextInt();
int a=n;
while(n>0)
{
sum+=n%10;
n=n/10;
}
if((a%sum)==0)
{System.out.println(a + " is a harshad number.\n");}
else
{System.out.println(a + " is not harshad number.\n");}
/*System.out.println("The Harshad number between 100 and 900 are : \n");
for(int i=100;i<=900;i++)
{
int p=i,s=0;
while(i>0)
{
s+=i%10;
i=i/10;
}
if((p%s)==0)
System.out.println(p + " ");
else{}
}*/

}
}
