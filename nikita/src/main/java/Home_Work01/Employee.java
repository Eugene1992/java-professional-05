package Home_Work01;

/**
 * Created by Никита on 05.07.2017.
 */
public class Employee {
    public String name;
    public int age;
    public int salary;

   Employee(String name, int age, int salary){
       this.name = name;
       this.age = age;
       this.salary = salary;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}