package d3.p94;

public class ThrowsExample {
    public void exceptionMethod() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        ThrowsExample te = new ThrowsExample();
        try {
            te.exceptionMethod();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
