package d1.p77;

public class OperatorExample {
    public static void main(String[] args) {
        int x = 1000000;
        int y = 1000000;

        int iz = x * y;
        long iz1 = (long)x * (long)y;
        long iz2 = (long)(x * y);

        System.out.println(iz);
        System.out.println(iz1);
        System.out.println(iz2);
    }
}