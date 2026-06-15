package d3.p7;

public class CellPhone {
    String model;
    String color;

    CellPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void powerOn() {
        System.out.println("Power On");
    }
    void powerOff() {
        System.out.println("Power Off");
    }

    void bell() {
        System.out.println("Bell ring");
    }

    void sendVoice(String message) {
        System.out.println("Send Message : " + message);
    }

    void receiveVoice(String message) {
        System.out.println("Receive Message : " + message);
    }

    void hangUp() {
        System.out.println("Hang Up");
    }
}
