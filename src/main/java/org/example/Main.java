package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(printSumTrue());
        printNumber(6);
        System.out.println(printNumberReverse(-100));
        printString("Dog", 6);
        System.out.println(printYear(2024));
        printArray();
        printHundredArray();
        printMinMultiply();
        printTwoDimensionalArray();
        printOneDimensionalArray(6,3);
    }

    public static void printThreeWords() {
        System.out.println("Задание 1");
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        System.out.println("\nЗадание 2");
        int a = 10;
        int b = -5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.println("\nЗадание 3");
        int value = 3;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.println("\nЗадание 4");
        int a = 100;
        int b = -5;
        System.out.println((a >= b) ? "a >= b" : "a < b");
    }

    public static boolean printSumTrue() {
        System.out.println("\nЗадание 5");
        int a = 1;
        int b = 15;
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void printNumber(int a) {
        System.out.println("\nЗадание 6");
        System.out.println(a >= 0 ? "Положительное число" : "Отрицательное число");
    }

    public static boolean printNumberReverse(int a) {
        System.out.println("\nЗадание 7");
        return (a >= 0 ? false : true);
    }

    public static void printString(String str, int a) {
        System.out.println("\nЗадание 8");
        for (int i = 0; i < a; i++) {
            System.out.print(str + ", ");
        }
        System.out.println();
    }

    public static boolean printYear(int year) {
        System.out.println("\nЗадание 9");
      if (year % 400 == 0) {
        return true;
    } else if (year % 100 == 0) {
        return false;
    } else if (year % 4 == 0){
        return true;
    }else {
        return false;
    }
     }

    public static void printArray() {
        System.out.println("\nЗадание 10");

        int[] numbers = {1, 1, 0, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив: ");
            System.out.println(Arrays.toString(numbers) + " ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1  - numbers[i];
       }
        System.out.print("Измененный массив: ");
            System.out.print(Arrays.toString(numbers) + " ");
        System.out.println();
}

    public static void printHundredArray() {
        System.out.println("\nЗадание 11");
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
            System.out.print(Arrays.toString(array) + " ");
        System.out.println();
    }

    public static void printMinMultiply() {
        System.out.println("\nЗадание 12");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
        System.out.println();
    }

    public static void printTwoDimensionalArray() {
        System.out.println("\nЗадание 13");
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][5 - 1 - i] = 1;
        }
        for (int[] in : array) {
                System.out.print(Arrays.toString(in));
            System.out.println();
        }
    }

    public static void printOneDimensionalArray(int len, int initialValue) {
        System.out.println("\nЗадание 14");
        int[] array = IntStream.range(0, len).map(i -> initialValue).toArray();
            System.out.print(Arrays.toString(array));
    }

}
