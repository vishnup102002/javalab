import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter marks for Math: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();

        
        int totalMarks = math + physics + chemistry;
        int totalMathPhysics = math + physics;

        
        if (totalMarks >= 150) {
            System.out.println("The student is eligible based on total marks (Math + Physics + Chemistry).");
        } else {
            System.out.println("The student is NOT eligible based on total marks (Math + Physics + Chemistry).");
        }

        
        if (totalMathPhysics >= 120) {
            System.out.println("The student is eligible based on total marks (Math + Physics).");
        } else {
            System.out.println("The student is NOT eligible based on total marks (Math + Physics).");
        }

        scanner.close();
    }
}
