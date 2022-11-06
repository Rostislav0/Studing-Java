public class Lesson10 {
    public static void main(String[] args) {
         String text = "Madam, I'm Adam!";
         System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String clearText = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder text2Reverse = new StringBuilder(clearText);
        return clearText.equalsIgnoreCase(text2Reverse.reverse().toString());
    }

}
