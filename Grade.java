import java.util.Scanner;
class Grade
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter marks : ");
int marks = scan.nextInt();
if(marks>=80)
System.out.println("A");
else if(marks>=60 && marks<80)
System.out.println("B");
else if(marks>=50 && marks<60)
System.out.println("C");
else if(marks>=45 && marks<50)
System.out.println("D");
else if(marks>=25 && marks<45)
System.out.println("E");
else if(marks<25 && marks >=0)
System.out.println("F");
else
{System.out.println("Enter marks in range of 0-100");}


}
}
