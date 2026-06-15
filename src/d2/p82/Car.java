package d2.p82;

public class Car {
    String color;
    int cc;

    Car() {
        System.out.println("Constructor Car()");
    }

    Car(String color, int cc) {
        System.out.println("Constructor Car(String color, int cc)");
        this.color = color;
        this.cc = cc;
    }

    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car("black", 3000);
    }
}