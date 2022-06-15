package Lessons.REFLECTIONS;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Start1 {

    public static void main(String[] args) {

        Car car = new Car();
        Car onlyOneCar = new Car() {
            @Override
            protected void printSerialNumber() {
                System.out.println(serialNumber + "only 1");
            }
        };


        /** How to get Class of class:**/
        System.out.println("Getting CLASS:");
        // 1 way
        try {
            Class<?> carClass1 = Class.forName("Lessons.REFLECTIONS.Car");
            System.out.println("1 WAY: " + carClass1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 2 way
        Class<? extends Car> carClass2 = car.getClass();
        System.out.println("2 WAY: " + carClass2);

        // 3 way (BEST)
        Class<Car> carClass3 = Car.class;
        System.out.println("3 WAY: " + carClass3);

        /*** How to get info about fields of class: **/

        System.out.println("\n------ FIELDS ------");
        // 1. getDeclaredFields()
        System.out.println("\n1. getDeclaredFields()");

        Field[] declaredFields = carClass2.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        // 2. getDeclaredField()
        System.out.println("\n2. getDeclaredField()");
        try {
            Field horsepowerField = carClass2.getDeclaredField("horsePower");
            System.out.println(horsepowerField);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        // 3. getFields() - only PUBLIC fields
        System.out.println("\n3. getFields()");
        Field[] fields = carClass2.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 4. getField() - only Public field
        System.out.println("\n4. getField()");
        try {
            Field serialNumberField = carClass2.getField("serialNumber");
            System.out.println(serialNumberField);
            // Field horsePowerField = carClass2.getField("horsePower");   ----> EXCEPTION because not public
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        /** How to get INFO about methods **/
        System.out.println("\n------ METHODS ------");

        // 1. getDeclaredMethods()
        System.out.println("\n1. getDeclaredMethods()");
        Method[] declaredMethods = carClass2.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        // 2. getDeclaredMethod()
        System.out.println("\n2. getDeclaredMethod()");
        try {
            Method printSerialNumberMethod = carClass2.getDeclaredMethod("printSerialNumber");
            System.out.println(printSerialNumberMethod);

            Method setHorsePowerMethod = carClass2.getDeclaredMethod("setHorsePower", int.class);
            System.out.println(setHorsePowerMethod);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //3. getMethods() - Only PUBLIC methods and his parents
        System.out.println("\n3. getMethods()");
        Method[] methods = carClass2.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // 4. getMethod() - Only PUBLIC
        System.out.println("\n4. getMethod()");
        try {
            Method getHorsePowerMethod = carClass2.getMethod("getHorsePower");
            System.out.println(getHorsePowerMethod);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // 5. getEnclosingMethod() - for ANONYMOUS classes
        System.out.println("\n5. getEnclosingMethod()");
        Method enclosingMethod = onlyOneCar.getClass().getEnclosingMethod();
        System.out.println(enclosingMethod);


    }
}
