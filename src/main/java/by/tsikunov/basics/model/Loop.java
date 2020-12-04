package by.tsikunov.basics.model;

import java.util.Scanner;

public class Loop {

    /*
    First Task. Напишите программу, где пользователь вводит любое целое положительноечисло.
    А программа суммирует все числа от 1 до введенного пользователем числа.
    */
    public int firstTask(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }

    /*
    Second Task. Вычислить значения функции на отрезке [а,b] c шагом h:
                y = { x, x > 2
                    {-x, x <= 2
    */
    public String secondTask(int a, int b, int h) {
        StringBuilder result = new StringBuilder();
        for (int i = a; i <= b; i += h) {
            result.append(i <= 2 ? -i : i).append(" ");
        }
        return result.toString();
    }

    /*
    Third Task. Найти сумму квадратов первых ста чисел.
    */
    public int thirdTask() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i * i;
        }
        return result;
    }

    /*
    Fourth Task. Составить программу нахождения произведения
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
    Fifth Task. Даны числовой ряд и некоторое число е.
    Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
    Общий член ряда имеет вид:
    An = 1/2^n + 1/3^n
    */
    public double fifthTask(double e) {
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
    Sixth Task. Вывести на экран соответствий между символами и их
    численными обозначениями в памяти компьютера.
    */
    public String sixthTask() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 255; i++) {
            result.append(i).append(" ").append((char) i).append("\n");
        }
        return result.toString();
    }

    /*
    Seventh Task. Для каждого натурального числа в промежутке от m до n вывести все делители,
    кроме единицы и самого числа. m и n вводятся с клавиатуры.
    */
    public String seventhTask(int m, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = m; i <= n; i++) {
            result.append(i).append(": ");
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    result.append(j).append(" ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    /*
    Eighth Task. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
    */
    public int eighthTask() {
        int result = -1;
        int digit;

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        boolean isZero = number1 % 10 == 0;
        do {
            digit = number1 % 10;
            number1 /= 10;
            if(isDigitInNumber(digit, number2)) {
                result = result == -1 ? 0 : result;
                if(!isDigitInNumber(digit, result)) {
                    result = result * 10 + digit;
                }
            }
        } while(number1 != 0);

        if(!isDigitInNumber(0, result) && isZero) {
            result *= 10;
        }
        return result;
    }
    /*
    Проверка на вхождение цифры в число
    */
    private boolean isDigitInNumber(int digit, int number) {
        do {
            if(number % 10 == digit) {
                return true;
            }
            number /= 10;
        } while (number != 0);
        return false;
    }
}
