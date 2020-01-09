class Sici
{
public static void main(String args[])
{
int p=1000,t=10;
double r=5.0,a;
a= p * Math.pow(1 + (r/100),t);
System.out.println("Simple interest is : " + ((p*r*t)/100));
System.out.println("Compound interest is : " + (a-p));

}

}
