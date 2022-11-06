public class Lesson11 {
    public static void main(String[] args) {
        String weatherIsGood = "unknown";
        if (weatherIsGood.equals("good")){
            System.out.println("Weather is good");
        } else {
            System.out.println("Weather is bad");
        }


        switch (weatherIsGood){
            case "good":
                System.out.println("Weather is good");
                break;
            case "bad":
                System.out.println("Weather is bad");
                break;
            default:
                System.out.println("Weather is unknown");
        }

    }
}
