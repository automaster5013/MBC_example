package d2_p8;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = 84;

        if (score>= 90) {
            System.out.println("A");
            if (score >= 95) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        } else {
            System.out.println("B");
            if (score >= 85) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
