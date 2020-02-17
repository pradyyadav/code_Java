import java.util.Scanner;
public class ReverseNumber {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number to get it reversed : ");
            int num = scan.nextInt();
            int reversed = 0;
            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
System.out.println("Reversed Number: " + reversed);
}
}
