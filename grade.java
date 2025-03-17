import java.util.Scanner;

public class grade {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the percentage");
        double percentage = scanner.nextDouble();

        String message;
        if (percentage >= 90) {
            message = "excellent work";
        }else if (percentage >= 80) {
            message = "Good job!";
        } else if (percentage >= 70) {
            message = "You can do better";
        } else if (percentage >= 60) {
            message = "Work harder";
        } else {
            message = "Failed. Try again";
        }

        
        System.out.println("Grade: " + message);

        scanner.close();
    }
}
