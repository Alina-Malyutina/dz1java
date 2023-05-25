package dz1;
//Вычислить n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task1part2 {
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n = factorial(num);
        System.out.println(n);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1 )
            return 1;
        return n * factorial(n - 1);
    }
}
