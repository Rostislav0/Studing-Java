public class Lesson5 {
    public static void main(String[] args) {
        int a = 29;
        char answer = charExpression(a);
        System.out.println(answer);
    }

    public static char charExpression(int a) {
        return (char) ((int) '\\' + a);
    }
}
