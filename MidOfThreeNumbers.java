import java.util.Scanner;

public class MidOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, largest, smallest, temp;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a == b || a == c) {
            System.out.println("Mid Number is: " + a);
            System.exit(0);
        }
        temp = a >= b ? a : b;
        largest = c >= temp ? c : temp;
        temp = a <= b ? a : b;
        smallest = c <= temp ? c : temp;
        if (a != largest && a != smallest)
            System.out.println("Mid Number is: " + a);
        else if (b != largest && b != smallest)
            System.out.println("Mid Number is: " + b);
        else
            System.out.println("Mid Number is: " + c);
    }
}
