package d3.p47;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new SmartPhone("홍길동");

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
