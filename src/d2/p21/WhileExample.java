package d2.p21;

public class WhileExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

            if(i == 5) {
                break;
            }
        }
    }
}
