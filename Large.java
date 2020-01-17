import java.util.Scanner;
class Large
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter four numbers to compare with each other : \n");
int n,a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),d=scan.nextInt();
n=((a>b) && (a>c) && (a>d))?a:(((b>c) && (b>d))?b:((c>d)?c:d));
System.out.println("Greatest number is : " + n + "\n");



}
}
