package d4.p29;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("d4.p29.TClass");

            System.out.println("[Class Name]");
            System.out.println(clazz.getName());
            System.out.println();

            System.out.println("[Constructor Info]");
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.print(constructor.getName() + "(");
                Class[] parameters = constructor.getParameterTypes();
                printParameters(parameters);
                System.out.println(")");
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printParameters(Class[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getName());
            if (i < parameters.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
