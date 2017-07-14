package reflect;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.*;

public class ReflectionTest {

    private Employee employee;
    private Class aClass;

    @Before
    public void setUp() {
        employee = new Employee("Nikita", 25, 10000);
        aClass = employee.getClass();
    }

    @Test
    public void getClassFieldsNames() {
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }

    @Test
    public void getClassFieldsNamesAndModifiers() {
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            int modifiers = declaredField.getModifiers();

            if (Modifier.isPrivate(modifiers)) {
                System.out.print("private ");
            }
            if (Modifier.isPublic(modifiers)) {
                System.out.print("private ");
            }
            if (Modifier.isStatic(modifiers)) {
                System.out.print("static ");
            }
            System.out.println(declaredField.getName());
        }
    }

    @Test
    public void getClassFieldsNamesAndValue() throws IllegalAccessException {
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(employee);

            System.out.println(declaredField.getName() + " = " + value);

            System.out.println(declaredField.isAccessible());
        }
    }

    @Test
    public void getClassMethods() throws IllegalAccessException {
        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                System.out.print("public ");
            }
            System.out.println(method.getName());
        }
    }

    @Test
    public void getReturnType() throws IllegalAccessException, NoSuchMethodException {
        Method getName = aClass.getDeclaredMethod("getName");

        Class<?> returnType = getName.getReturnType();

        System.out.println(returnType.getName());

    }

    @Test
    public void invokeMethod() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method secret = aClass.getDeclaredMethod("totallySecret");
        secret.setAccessible(true);

        secret.invoke(employee);
    }

    @Test
    public void init() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Employee o = (Employee) aClass.newInstance();

        o.setName("Born");

        System.out.println(o.getName());
    }

    @Test
    public void getConstructors() {
        Constructor[] constructors = aClass.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getName());
            }
        }
    }

    @Test
    public void initClasses() throws ClassNotFoundException {

        Class<?> aClass = Class.forName("reflect.Dog");

        System.out.println(aClass.getSuperclass().getSimpleName());
    }
}

