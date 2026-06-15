package d3.p42;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        if(parent instanceof Parent) {  // Parent p = new parent(); true
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(parent instanceof Child) {   // Child c = new Parent(); false
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(child instanceof Parent) {   // Parent p = new Child();  true
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(child instanceof Child) {    // Child c = new child();   true
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
