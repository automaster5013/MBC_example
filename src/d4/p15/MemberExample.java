package d4.p15;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("홍길동", 25, new int[] { 90, 80 }, new Car("소나타"));

        Member cloned = original.getMember();
        cloned.scores[0] = 101;
        cloned.car.model = "K5";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("name : " + cloned.name);
        System.out.println("age : " + cloned.age);
        System.out.println("scores : {");
        for (int i =0; i < cloned.scores.length; i++) {
            System.out.println(cloned.scores[i]);
            System.out.println((i == (cloned.scores.length - 1)) ? "" : ",");
        }
        System.out.println("}");
        System.out.println("car : " + cloned.car.model);
        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("name : " + original.name);
        System.out.println("age : " + original.age);
        System.out.println("scores : {");
        for (int i = 0; i < original.scores.length; i++) {
            System.out.println(original.scores[i]);
            System.out.println((i == (original.scores.length - 1)) ? "" : ",");
        }
        System.out.println("}");
        System.out.println("car : " + original.car.model);
        System.out.println();
    }
}
