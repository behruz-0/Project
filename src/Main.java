import java.lang.Math;

class FunctionCalculator {
    public static void main(String[] args) {
        double[] xValues = {1.0, 2.0, 3.0, 4.0, 5.0}; // Пример значений x
        System.out.println("Вычисление значений функции f(x) = e^x:");

        for (double x : xValues) {
            double result = Math.exp(x); // Вычисление значения функции
            System.out.println("x = " + x + ", f(x) = " + result);
        }
    }
}
