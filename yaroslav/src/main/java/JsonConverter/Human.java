package JsonConverter;

@JEntity
public class Human {
    @JPointer(name = "name")
    private String FirstName;
    @JPointer
    private String LastName;
    @JPointer
    private int age;

    public Human(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }
}
