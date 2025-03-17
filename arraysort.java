import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        String[] arr = {"Banana", "Apple", "Orange", "Mango", "Pineapple"};
        
        Arrays.sort(arr);
        
        System.out.println("Sorted array of strings:");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
