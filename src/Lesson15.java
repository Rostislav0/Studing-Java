public class Lesson15 {
    public static void main(String[] args) {

        String[] roles = { "Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines =   {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Городничий: Господа, сообщаю вам пренеприятное известие, его поведал мне Артемий Филиппович: к нам едет ревизор."
        };

        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();

        for (int i=0; i<roles.length; i++){
            result.append(roles[i]).append(":").append('\n');
            for (int t=0; t<textLines.length; t++){
                if (textLines[t].startsWith(roles[i]+":")) {
                    result.append(String.format("%s) %s\n", t+1,
                            textLines[t].replaceFirst(roles[i] + ": ", "")));
                }
            }
            result.append("\n");

        }

        return result.toString();
    }
}
