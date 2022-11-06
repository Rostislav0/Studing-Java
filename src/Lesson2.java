public class Lesson2 {



    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        boolean answer = booleanExpression(a, b, c, d);

        System.out.println(answer);
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a != b) && (c != d)) || ((a != c) && (b != d));
    }

}



