class Digit_Sum
{
public static void main(String args[])
{
int sum=0,a,n = 123;
a=n;
while(n!=0)
{
sum+=(n%10);
n=n/10;
}
System.out.println("Sum of all digits in "+ (a) + " is : "+ sum);
}
}
