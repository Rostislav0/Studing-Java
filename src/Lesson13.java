import java.math.BigInteger;

public class Lesson13 {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(factorial(a));
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger valueFactorial = BigInteger.ONE;
        for (int i = 1; i <= value ; i++){
            valueFactorial = valueFactorial.multiply(BigInteger.valueOf(i));
        }

        return valueFactorial;
    }
}
