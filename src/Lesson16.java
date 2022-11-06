public class Lesson16 {
    public static void main(String[] args) {
        getDaysOfWeek();
    }

    public enum DayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    @Deprecated // use new method, it's old
    static void getDaysOfWeek(){
        for (DayOfWeek day : DayOfWeek.values()){
            System.out.println(day.ordinal() + " " + day.name());
        }
    }
}
