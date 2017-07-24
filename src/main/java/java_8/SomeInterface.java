package java_8;

public interface SomeInterface {

    default void d(){}

    default void d2(){}

    static void s(){}

    static void s2(){}

//    void a();

    class A implements SomeInterface {

        @Override
        public void d() {

        }

        public static void main(String[] args) {
            SomeInterface.s();
            new A().d();
        }
    }
}
