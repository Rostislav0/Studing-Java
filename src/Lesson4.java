public class Lesson4 {
    public static void main(String[] args) {

        int value = 13;
        int bitIndex = 4;

        int answer = flipBit(value, bitIndex);
        System.out.println(answer);
    }

    public static int flipBit(int value, int bitIndex){

        return value^(1<<(bitIndex-1));
    }
}
