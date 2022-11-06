public class Lesson6 {
    public static void main(String[] args) {
        int a = -2;
        boolean answer = isPowerOfTwo(a);
        System.out.println(answer);
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
