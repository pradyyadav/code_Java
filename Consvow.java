import java.util.Scanner;
class Consvow
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter a letter to check whether Vowel or Consonant : ");

String letter1 = scan.next();

char letter=letter1.charAt(0);

if((letter== 'a') || (letter== 'e') || (letter== 'i') || (letter== 'o') || (letter == 'u') || (letter== 'A') || (letter== 'E') || (letter== 'I') || (letter== 'O') || (letter== 'U'))
{
System.out.println("It's a Vowel!!!\n");
}
else
{
System.out.println("It's a Consonant!!!\n");
}
}
}

