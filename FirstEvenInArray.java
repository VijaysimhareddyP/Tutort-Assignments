import java.util.Scanner;

public class FirstEvenInArray {
    public static void main(String[] args) {
        System.out.println("Enter Size of the Array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                break;
            }
            else if (i == size - 1) {
                System.out.println(-1);
            }
        }
    }
}
