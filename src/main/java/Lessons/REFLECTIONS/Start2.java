package Lessons.REFLECTIONS;

import jdk.jfr.Description;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Start2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();

        /** Получение значения public переменной **/
        System.out.println("1. Получение значения public переменной");
        Field serialNumberField = carClass.getDeclaredField("serialNumber");

        String serialNumberValue = (String) serialNumberField.get(car); //указываем из какого объекта мы хотим получить значение
        System.out.println("serialNumberValue: " + serialNumberValue);

        /** Получение значения private переменной **/
        System.out.println("\n2. Получение значения private переменной");
        Field horsePowerField = carClass.getDeclaredField("horsePower");

        horsePowerField.setAccessible(true);              // without THIS CODE ----> IllegalAccessException

        int horsePowerValue = horsePowerField.getInt(car);
        System.out.println("horsepowerValue: " + horsePowerValue);

        /** Получение имени, типа и модификаторов переменной **/
        System.out.println("\n3. Получение имени, типа и модификаторов переменной");

        String name = horsePowerField.getName();
        System.out.println("horsepowerField.getName(): " + name);

        Class<?> type = horsePowerField.getType();
        System.out.println("horsepowerField.getType(): " + type);

        int modifiers = horsePowerField.getModifiers();
        System.out.println("horsepowerField.getModifiers(): " + modifiers);
        System.out.println("Modifier.isPrivate(modifiers): " + Modifier.isPrivate(modifiers));
        System.out.println("Modifier.isFinal(modifiers): " + Modifier.isFinal(modifiers));

        /** Получение аннотаций переменной **/
        System.out.println("\n4. Получение аннотаций переменной");

        Annotation[] annotations = horsePowerField.getAnnotations();
        System.out.println(Arrays.toString(annotations)); //output: [@jdk.jfr.Description(value="the power of an engine")]

        Description descriptionAnnotation = horsePowerField.getAnnotation(Description.class);
        System.out.println(descriptionAnnotation); //output: [@jdk.jfr.Description(value="the power of an engine")]

        Annotation[] annotationsByType = horsePowerField.getAnnotationsByType(Description.class);
        System.out.println(Arrays.toString(annotationsByType)); //output: [@jdk.jfr.Description(value="the power of an engine")]






    }
}
