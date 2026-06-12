package d2.p25;

public class BreakExample {
    public static void main(String[] args) {
        int i = 1;
        // 무한루프
        while (true) {
            System.out.println(i);

            if (i == 6)
                break;

            i = i + 1;
        }

        int j = 10;
        // 무한루프
        for ( ; ; ) {
            System.out.println(j);

            if (j == 15)
                break;
            j += 1;
        }
    }
}
