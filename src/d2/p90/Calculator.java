package d2.p90;

public class Calculator {
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        int res1 = myCalc.plus(5, 10);
        double res2 = myCalc.plus(10.5, 20.3);

        System.out.println(res1);
        System.out.println(res2);
    }
}