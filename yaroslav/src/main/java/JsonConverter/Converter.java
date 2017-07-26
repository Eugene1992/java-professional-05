package JsonConverter;

import java.lang.reflect.Field;

public class Converter {
    private String compiller;

    // TODO: 24.07.2017 method should return json string representation, use StringBuilder
    public String convert(Object obj) {

        Class<?> aClass = obj.getClass();
        String nameOfClass = aClass.getSimpleName();
        boolean jEntityAnnotationPresent = aClass.isAnnotationPresent(JEntity.class);

        if (!jEntityAnnotationPresent) {
            throw new NullPointerException("Can not be convert, because annotation under class '" + nameOfClass + "' is absent");
        }
        Field[] fields = aClass.getDeclaredFields();
        compiller += "{";
        for (Field field : fields) {
            boolean jPointerAnnotationPresent = field.isAnnotationPresent(JPointer.class);
            if (jPointerAnnotationPresent) {
                field.setAccessible(true);
                Object o = null;
                try {
                    o = field.get(obj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                compiller += "\"" + field.getName() + "\"" + ":" + "\"" + o + "\",";
            }
        }
        compiller += "}";

        return compiller;
    }
}
