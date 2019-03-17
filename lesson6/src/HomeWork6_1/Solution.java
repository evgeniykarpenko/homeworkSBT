package HomeWork6_1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Car car = new Car("Jeep", 4);
        Class myClass = car.getClass();
        // System.out.println(Arrays.toString(myClass.getDeclaredMethods())+"\\n");
        while (myClass != null) {
            System.out.println("!!! All Methods in class - " + myClass + ": ");
            Method[] declaredMethods = myClass.getDeclaredMethods();
            for (Method m : declaredMethods) {
                System.out.println(m);
            }
            myClass = myClass.getSuperclass();
        }
        System.out.println();
        myClass = car.getClass();
        System.out.println("!!! Only Get Methods in class - " + myClass + ": ");
        Method[] declaredMethods = myClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            if (m.getName().startsWith("get"))
                System.out.println(m);
        }

        Field[] fields = myClass.getDeclaredFields();


        for (Field f : fields) {
            if (Modifier.isFinal(f.getModifiers())) {
                try {
                    System.out.println(f.getName() + ": ");
                    System.out.println(f.getName().equals(f.get(car)));
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

class Car {
    public static final String GASPEDAL = "GASPEDAL";
    public static final String BRAKEPEDAL = "BRAKEPEDAL";
    public static final String STEERINGWHEEL = "РУЛЬ";


    private String name;
    private int wheels;

    private String getEngineBluePrint() {
        return "Real BluePrint of the Car";
    }

    public Car(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
