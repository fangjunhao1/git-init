package dividedbyzero;

public class Main {
    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.printf("Caught runtime exception = %s\n", e.getMessage());
        }
    }

    public static int divideByZero() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }
}
