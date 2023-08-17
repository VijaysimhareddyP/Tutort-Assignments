import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        System.out.println("Enter Size of the Array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        System.out.println("Enter Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of Elements in Array = " + sum);
    }
}
