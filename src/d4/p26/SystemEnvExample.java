package d4.p26;

public class SystemEnvExample {
    public static void main(String[] args) {
        String path = System.getenv("Path");
        System.out.println("Path : " + path);
    }
}
