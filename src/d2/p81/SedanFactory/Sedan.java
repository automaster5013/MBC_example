package d2.p81.SedanFactory;

import d2.p81.Component.Tire;

public class Sedan {
    public static void main(String[] args) {
        Tire compoTire = new Tire();
        compoTire.setSize(20);

        System.out.println(compoTire.getSize());
    }
}
