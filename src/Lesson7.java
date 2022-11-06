import java.util.Arrays;
import java.util.OptionalInt;

public class Lesson7 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3};
        int[][] arrayMulti = new int[][] {{1, 2, 3}, {4, 5, 6}};
        int[][] arrayMulti2 = new int[][] {{4, 5}, {7, 8, 9, 20}};


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(arrayMulti2));

        System.out.println(array.length);
        System.out.println(Arrays.equals(arrayMulti[0], array));
        System.out.println(Arrays.deepEquals(arrayMulti, arrayMulti2));

        System.out.println(maxArray(array));

        System.out.println(maxVarargs(1, 2, 3));

    }

    static OptionalInt maxArray(int[] numbers) {
        return Arrays.stream(numbers).max();
    }

    static int maxVarargs(int ... numbers) {
        OptionalInt max = Arrays.stream(numbers).max();
        return max.getAsInt();
    }


}
