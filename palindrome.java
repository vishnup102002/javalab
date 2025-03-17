import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int og = num;
        int reverse = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        
        if (og == reverse) {
            System.out.println(og + " is a palindrome.");
        } else {
            System.out.println(og + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
