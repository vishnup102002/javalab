import java.util.Scanner;

public class employeesalary {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the job title (Manager, Developer, Intern): ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter years of experience: ");
        int yearsOfExperience = scanner.nextInt();

        
        int baseSalary = 0;
        
        if (jobTitle.equalsIgnoreCase("Manager")) {
            baseSalary = 50000;
        } else if (jobTitle.equalsIgnoreCase("Developer")) {
            baseSalary = 30000;
        } else if (jobTitle.equalsIgnoreCase("Intern")) {
            baseSalary = 15000;
        } else {
            System.out.println("Invalid job title.");
            return;
        }

        
        double bonusPercentage = 0.0;
        if (yearsOfExperience >= 5) {
            bonusPercentage = 0.20;  
        } else if (yearsOfExperience >= 3) {
            bonusPercentage = 0.10;  
        } else {
            bonusPercentage = 0.0;  
        }

        
        double totalSalary = baseSalary + (baseSalary * bonusPercentage);
        System.out.println("The total salary is: " + totalSalary);
        scanner.close();
    }
}
