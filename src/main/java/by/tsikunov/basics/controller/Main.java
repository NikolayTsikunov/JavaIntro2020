package by.tsikunov.basics.controller;

import by.tsikunov.basics.model.Branching;
import by.tsikunov.basics.model.Loop;
import by.tsikunov.basics.model.Linear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Linear linearOperation = new Linear();
        Branching branchingOperation = new Branching();
        Loop loopOperation = new Loop();

//        //========================
//        System.out.printf("Введите целое положительное число больше 0:\n");
//        int number = (int)getNumber();
//        System.out.printf("Сумма от 1 до %d равна %d \n", number, loopOperation.firstTask(number));
//        //========================
//
//        //========================
//        System.out.printf("Введите первую границу отрезка [a,b]:\n");
//        int a = (int)getNumber();
//        System.out.printf("Введите вторую границу отрезка [a,b] больше %d:\n", a);
//        int b = (int)getNumber();
//        System.out.printf("Введите шаг h:\n");
//        int h = (int)getNumber();
//        System.out.printf("Вычислить значения функции на отрезке [%d,%d] c шагом %d:\n%s",
//                a, b, h, loopOperation.secondTask(a, b, h));
//        //========================

//        //========================
//        System.out.printf("Сумма квадратов первых ста чисел: %d\n", loopOperation.thirdTask());
//        //========================
//
//        //========================
//        System.out.printf("Произведение квадратов первых двухсот чисел: %f\n", loopOperation.fourthTask());
//        //========================

//        //========================
//        System.out.printf("Введите положительное вещественное число е:\n");
//        double e = getNumber();
//        System.out.printf("Сумма членов ряда, модуль которых больше или равен %f: %f\n",
//                e, loopOperation.fifthTask(e));
//        //========================

//        //========================
//        System.out.printf("Соответствие между символами и их численными обозначениями:\n");
//        System.out.println(loopOperation.sixthTask());
//        //========================

        //========================
    /*
    Seventh Task. Для каждого натурального числа в промежутке от m до n вывести все делители,
    кроме единицы и самого числа. m и n вводятся с клавиатуры.
    */
        System.out.printf("Введите натуральное число m:\n");
        int m = (int)getNumber();

        //========================

        //========================

        //========================

    }

    //=========================================
    /*
    Получение числа с клавиатуры
    */
    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        double number  = scanner.nextDouble();
        return number;
    }
}
