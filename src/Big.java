import java.math.BigInteger;

public class Big {
    // Recursive factorial method using BigInteger
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method to display table of integers and their factorials
    public static void displayFactorialsTable(int start, int end) {
        System.out.println("Integer | Factorial");
        System.out.println("--------|---------------------");
        for (int i = start; i <= end; i++) {
            System.out.printf("%7d | %s%n", i, factorial(i));
        }
    }

    public static void main(String[] args) {
        displayFactorialsTable(0, 30);
    }
}