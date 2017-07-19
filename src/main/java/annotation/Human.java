package annotation;

import lombok.Data;

@Data
@MyAnnotation(num = 1)
public class Human implements Cloneable {

    @MyAnnotation(num = 10, enabled = true)
    private String name;

    @MyAnnotation(num = 3)
    private int age;
}
