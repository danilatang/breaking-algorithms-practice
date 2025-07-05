package thirdModule;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        return n == 1 ? 1 : factorial(n - 1) * n;
    }
}
