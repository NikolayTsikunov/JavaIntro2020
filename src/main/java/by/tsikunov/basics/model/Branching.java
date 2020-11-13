package by.tsikunov.basics.model;

public class Branching {

    /*
    Даны два угла треугольника (в градусах).
    Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным
    */
    public String firstTask(int firstAngle, int secondAngle) {
        String result = "It's not triangle";
        if(isTriangle(firstAngle, secondAngle)) {
            result = "It's %s triangle";
            if(isTriangleRectangular(firstAngle, secondAngle)) {
                result = String.format(result,"rectangular");
            } else {
                result = String.format(result,"not rectangular");
            }
        }
        return result;
    }
    private boolean isTriangle(int firstAngle, int secondAngle) {
        boolean result = false;
        if((180 - firstAngle - secondAngle) > 0){
            result = true;
        }
        return result;
    }
    private boolean isTriangleRectangular(int firstAngle, int secondAngle) {
        boolean isTriangle = isTriangle(firstAngle, secondAngle);
        boolean result = false;
        if(isTriangle){
            if(firstAngle == 90 || secondAngle == 90 || (180 - firstAngle - secondAngle) == 90) {
                result = true;
            }
        }
        return result;
    }

    /*
    Найти max{min(a, b), min(c, d)}.
    */
    public int secondTask(int a, int b, int c, int d) {
        return max(min(a, b), min(c, d));
    }
    private int max(int a, int b) {
        return a > b ? a : b;
    }
    private int min(int a, int b) {
        return a < b ? a : b;
    }

    /*
    Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    */
    public boolean thirdTask(int x1, int y1, int x2, int y2, int x3, int y3) {
        boolean result = false;
        if (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1) {
            result = true;
        }
        return result;
    }

    /*
    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    Определить, пройдет ли кирпич через отверстие.
    */
    public boolean fourthTask(int a, int b, int x, int y, int z) {
        boolean result = false;

        if((a >= x) && ((b >= y) || (b >= z))) {
            result = true;
        } else if((a >= y) && ((b >= x) || (b >= z))) {
            result = true;
        } else if((a >= z) && ((b >= x) || (b >= y))) {
            result = true;
        }
        return result;
    }

    /*
        Вычислить значение функции: F(x) = { x^2 - 3x + 9, x<=3
                                             1/(x^3 + 6), x > 3
    */
    public int fifthTask(int x) {
        int result = 0;
        if(x <= 3) {
            result = x * x - 3 * x + 9;
        } else {
            result = 1 / (x * x * x + 6);
        }
        return result;
    }
}
