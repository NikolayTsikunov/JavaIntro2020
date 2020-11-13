package by.tsikunov.basics.model;

import java.util.Scanner;

public class Cycle {
    /*
    Напишите программу, где пользователь вводит любое целоеположительноечисло.
    А программа суммирует все числа от 1 до введенного пользователем числа.
    */
    public int firstTask() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }

    /*
    Вычислить значенияфункции на отрезке [а,b] c шагом h:
                y = { x, x > 2
                     -x, x <= 2
    */
    public int secondTask() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        for (int i = a; i <= b; i += h) {
            result += i <= 2 ? -i : i;
        }
        return result;
    }

    /*
    Найти сумму квадратов первых ста чисел.
    */
    public int thirdTask() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i * i;
        }
        return result;
    }

    /*
    Составить программу нахождения произведения
    квадратов первых двухсот чисел.
    */
    public double fourthTask() {
        double result = 1;
        for (double i = 1; i <= 200; i++) {
            result *= i * i;
        }
        return result;
    }

    /*
    Даны числовой ряд и некоторое число е.
    Найти умму тех членов ряда, модуль которых больше или равен заданному е.
    Общий член ряда имеет вид:
    An = 1/2^n + 1/3^n
    */
    public double fifthTask() {
        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();
        double result = 0;
        double a = 0;

        for (int i = 1;; i++) {
            a = 1/Math.pow(2, i) + 1/Math.pow(3, i);
            if(a >= e) {
                result += a;
            } else {
                break;
            }
        }
        return result;
    }

    /*
    Вывести на экран соответствий между символами и их
    численными обозначениями в памяти компьютера.
    */
    public String sixthTask() {
        String result = "";
        for (int i = 0; i < 255; i++) {
            System.out.println(i + " " + (char) i);
            //System.out.println(String.valueOf(Character.toChars(i)));
        }
        return result;
    }
}
