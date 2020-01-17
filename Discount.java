import java.util.Scanner;
class Discount
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the quantity : ");
int quantity = scan.nextInt();
System.out.println("Enter the amount : ");
int amount = scan.nextInt();
int price = quantity*amount;
if(price > 1000)
{System.out.println("Total Cost : " + (price-(price*0.1)));}
else
{System.out.println("Total Cost : " + price);}



}
}
