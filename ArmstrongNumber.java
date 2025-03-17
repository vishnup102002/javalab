import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int og = num;
        int sum = 0;
        int numofdigit = String.valueOf(num).length();
        
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numofdigit);
            num /= 10;
        }
        
        if (og == sum) {
            System.out.println(og + " is an Armstrong number.");
        } else {
            System.out.println(og + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
