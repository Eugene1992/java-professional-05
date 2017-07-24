package java_8;

import java.util.function.Predicate;

public class OuterPredicate implements Predicate<MainTest.Employee> {

    @Override
    public boolean test(MainTest.Employee employee) {
        return employee.getGender() == MainTest.Gender.FEMALE;
    }
}
