package annotation;

import java.lang.reflect.Field;

public class AnnotationProccessingTest {
    public static void main(String[] args) {
        Human human = new Human();

        Class<? extends Human> aClass = human.getClass();

        boolean annotationPresent = aClass.isAnnotationPresent(MyAnnotation.class);
//        System.out.println(annotationPresent);

        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = declaredField.getAnnotation(MyAnnotation.class);
                int num = annotation.num();
                for (int i = 0; i < num; i++) {
                    System.out.println(declaredField.getName());
                }
            }
        }

        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
//            System.out.println(anInterface.getSimpleName());
        }
    }
}
