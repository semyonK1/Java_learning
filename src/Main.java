public class Main {
    private String name;
    static private double y;
    static private double S = 0;
    static private double step;
    static private double a;
    static private double b;

    public static void main(String[] args) {
        a = 0;
        b = 2;
        step = 0.0001;
        for (double x = a; x <= b; x = x + step) {
            y = f(x);
            S = S + step * y;
        }
        System.out.println("Площадь под графиком: " + S);
    }

    private static double f(double x) {
        return x;
    }
}