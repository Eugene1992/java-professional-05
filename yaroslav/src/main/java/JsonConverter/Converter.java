package JsonConverter;

import java.lang.reflect.Field;

public class Converter {
    public void convert(Object obj) {

        Class<?> aClass = obj.getClass();
        String nameOfClass = aClass.getSimpleName();
        boolean jEntityAnnotationPresent = aClass.isAnnotationPresent(JEntity.class);

        if(jEntityAnnotationPresent == false){
            System.err.println("Can not be convert, because annotation under class '" + nameOfClass + "' is absent");
        }
        Field[] fields = aClass.getDeclaredFields();
        System.out.println("{");
        for(Field field: fields){
            boolean jPointerAnnotationPresent = field.isAnnotationPresent(JPointer.class);
            if(jPointerAnnotationPresent == true){
                    field.setAccessible(true);
                Object o = null;
                try {
                    o = field.get(obj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                System.out.println("\""+ field.getName() +"\""+":" + "\""+ o +"\",");
            }

        }
        System.out.println("}");
    }

}
