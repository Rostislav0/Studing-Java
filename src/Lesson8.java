import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {

        char[] charArrays = {'a', 'b', 'c'};
        String string = new String(charArrays);
        System.out.println(string);
        char[][] charsFromString = new char[][] {string.toCharArray()};
        System.out.println(Arrays.deepToString(charsFromString));
    }

}
