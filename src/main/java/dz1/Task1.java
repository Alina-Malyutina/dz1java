package dz1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.printf("Треугольное число: %d\n", getNumber(number1));
        input.close();
    }

    public static int getNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
