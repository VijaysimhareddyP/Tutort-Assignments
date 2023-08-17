import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a >= b && a >= c)
            System.out.println("Largest Number is: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest Number is: " + b);
        else
            System.out.println("Largest Number is: " + c);
    }
}