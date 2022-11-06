public class Lesson12 {
    public static void main(String[] args) {
        int digit = 0;

        while (digit != 3){
            digit++;
            System.out.println(digit);
        }

        System.out.println();

        do {
            digit++;
            //System.out.println(digit);
        } while (digit != 6); {
            digit ++;
            System.out.println("End, digit equals: " + digit);
        }

        System.out.println();

        for (int i = digit; i != 10; i++){
            System.out.println(i);
        }

        System.out.println();

        int numbers[] = {1, 2, 3};
        operator:
        for (int i = 0; i != 2; i++) {
            for (int num : numbers) {
                if (num == 3) {
                    break operator;
                } else if (num == 1) {
                    continue;
                }

                System.out.println(num);

            }
        }
    }
}
