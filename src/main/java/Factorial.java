public class Factorial {

    public static int calculate(int n) {
        int fact = 1;
        for (int c = 1; c <= n; c++) {
            fact = fact * c;
        }

        return fact;
    }
}
