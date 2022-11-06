public class Lesson3 {
    public static void main(String[] args) {
        float a = 0.1f;
        float b = 0.2f;
        float c = 0.3f;
        boolean answer = doubleExpression(a, b, c);
        System.out.println(answer);
    }

    public static boolean doubleExpression(double a, double b, double c){
        return Math.abs((a + b) - c) < 1E-4;
    }
}
