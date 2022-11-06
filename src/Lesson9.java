public class Lesson9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hi");
        sb.append("space");
        sb.append("World");
        System.out.println(sb);
        String seb = sb.toString();
        String HiWorld = seb.replace("space", " ");
        System.out.println(HiWorld);
        Boolean isEqual = HiWorld.equalsIgnoreCase(seb);
        System.out.println(isEqual);
    }
}
