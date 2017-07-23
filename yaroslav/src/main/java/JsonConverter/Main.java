package JsonConverter;

/**
 * Created by Ярик on 22.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Ivan","Ivan", 18);
        Converter converter = new Converter();
        try {
            try {
                converter.convert(human);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
