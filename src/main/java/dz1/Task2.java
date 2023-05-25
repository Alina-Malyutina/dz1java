package dz1;

//Вывести все простые числа от 1 до 1000

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Простые числа: " + primeNumbers);
    }
}