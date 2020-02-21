package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_bmstu {
    public static void main(String[] args) {

        System.out.print("Количество чисел всего: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        System.out.print("Введите целые числа через пробел: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++)
            if ((sourceNumbers[i] % 5 == 0) && (sourceNumbers[i] % 7 == 0))  // (5 AND 7)
                System.out.println(sourceNumbers[i]);
    }
}
