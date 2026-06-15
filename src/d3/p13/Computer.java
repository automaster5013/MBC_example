package d3.p13;

public class Computer extends Calculator {
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCilcle() 실행");
        return Math.PI * r * r;
    }
}
