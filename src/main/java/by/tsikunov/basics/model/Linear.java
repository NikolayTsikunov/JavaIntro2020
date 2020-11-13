package by.tsikunov.basics.model;

public class Linear {

    /*
    Найти значение функции z=((a-3)*b/2)+c
    */
    public int firstTask(int a, int b, int c) {
        return ((a-3)*b/2)+c;
    }
    /*
    Вычислить значение выражения по формуле(переменные - действительные)
    */
    public double secondTask(double a, double b, double c) {
        return (Math.sqrt(Math.pow(b,2) + 4*a*c) + b)/(2*a) - Math.pow(a,3)*c+Math.pow(b, -2);
    }
    /*
    Вычислить значение выражения по формуле(переменные - действительные)
    */
    public double thirdTask(double x, double y) {
        return (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
    }

    /*
    Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
    */
    public double fourthTask(double r) {
        int integerPart = (int) r;
        int fractionalPart = (int)(r * 1000) % 1000;
        return fractionalPart + (double)integerPart / 1000;
    }

    /*
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc.
    */
    public String fifthTask(int t) {
        int h = t / 360;
        t = t % 360;
        int m = t / 60;
        int s = t % 60;
        return String.format("%dч %02dмин %02dс", h, m, s);
    }

    /*
    Для данной области составить линейную программу, которая печатает true,
    если точка с координатами (х, у) принадлежит закрашенной области,
    и false — в противном случае
    */
    public boolean sixthTask(int x, int y) {
        boolean upperYSquare = false;
        boolean belowYSquare = false;
        upperYSquare = (y > 0 && y <= 4) && (x <= 2 && x >= -2);
        belowYSquare = (y <= 0 && y >= -3) && (x <= 4 && x >= -4);
        return upperYSquare || belowYSquare;
    }
}
