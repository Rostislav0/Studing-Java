import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson14 {
    public static void main(String[] args) {
     int[] a1 = {0, 2, 2};
     int[] a2 = {1, 3};
     System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int pos1 = 0;
        int pos2 = 0;
        while(pos1<a1.length || pos2<a2.length) {
            result[pos1+pos2] = (pos1<a1.length && (pos2 == a2.length || a1[pos1]<a2[pos2]) ? a1[pos1++] : a2[pos2++]);
        }
        return result;
        //return IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().toArray();
    }
}
