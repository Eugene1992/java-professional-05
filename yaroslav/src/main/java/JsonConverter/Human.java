package JsonConverter;

@JEntity
public class Human {

    @JPointer(name = "name")
    private String firstName;

    @JPointer
    private String lastName;

    @JPointer
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
