package d5.p4;

public class ThreadTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println("thread");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
