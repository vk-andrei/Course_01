package Lessons.lesson_14.annotation.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // - ������� ���������
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER}) // - ��� ���� ����� �����������?

public @interface MyAnnotation {
    int priority() default 2;
}
