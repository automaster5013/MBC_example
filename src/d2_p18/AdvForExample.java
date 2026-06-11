package d2_p18;

public class AdvForExample {
    public static void main(String[] args) {
        int[] scores = {9, 7, 8, 9, 8};

        // 1. ===============================================
        int sum1 = 0;
        for(int s : scores) {
            sum1 += s;
        }
        System.out.println("sum1 : " + sum1);

        // 2. ===============================================
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum2 += scores[i];
        }

        System.out.println("sum2 : " + sum2);
    }
}
