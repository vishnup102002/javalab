import java.util.Scanner;

public class stringsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        
        System.out.print("Enter the string to search for: ");
        String pattern = scanner.nextLine();
        
        System.out.print("Enter the string to replace: ");
        String replacement = scanner.nextLine();
        
        String modifiedString = originalString.replaceAll(pattern, replacement);
        
        System.out.println("Modified string: " + modifiedString);
        
        scanner.close();
    }
}
